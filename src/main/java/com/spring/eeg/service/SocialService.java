package com.spring.eeg.service;

import com.spring.eeg.Dao.ArticleDao;
import com.spring.eeg.Dao.FriendApplicationDao;
import com.spring.eeg.Dao.FriendListDao;
import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.Model.ArticleJson;
import com.spring.eeg.Model.User;
import com.spring.eeg.Model.UserApplication;
import com.spring.eeg.mbg.model.*;
import com.spring.eeg.utils.ConstValues;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

@Slf4j
@Service
public class SocialService {
    @Autowired
    ArticleDao articleDao;
    @Autowired
    UserLoginDao userLoginDao;
    @Autowired
    FriendApplicationDao friendApplicationDao;
    @Autowired
    FriendListDao friendListDao;
    /**
     *  插入 存在覆盖
     * @param article
     * @param contents
     */
    private boolean insertArticle(Article article,String contents){
        File file = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(article.getArticlepath());
            if(file.exists()){
                file.delete();
            }else{
                file.createNewFile();
            }
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(contents);
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public void insertArticle(String title,String contents,String authority,Integer userId){
        Article article = new Article();
        article.setArticlename(title);
        article.setUserid(userId);
        article.setAuthority(authority);
        article.setUpdatedate(new Date());
        article.setUploaddate(new Date());
        String articlePath = ConstValues.ARTICLE_PATH + "user_"+userId+"_title_"+title+"_update_"+ LocalDate.now();
        article.setArticlepath(articlePath);
        insertArticle(article,contents);
        articleDao.insertArticle(article);
    }
    public void updateArticle(String title, String contents, String authority, Integer userId, Integer articleId){
        Article article =articleDao.getArticle(articleId);
        article.setAuthority(authority);
        article.setArticlename(title);
        article.setUpdatedate(new Date());
        insertArticle(article,contents);
        articleDao.updateArticle(article);
    }
    public ArticleJson EditArticle(Integer articleId){
        ArticleJson articleJson = new ArticleJson();
        Article article = articleDao.getArticle(articleId);
        String contents = getArticleContent(article.getArticlepath());
        articleJson.setAuthority(article.getAuthority());
        articleJson.setContents(contents);
        articleJson.setTitle(article.getArticlename());
        return articleJson;
    }
    private String getArticleContent(String articlePath){
        File file = new File(articlePath);
        if(!file.exists()){
            log.error("文件不存在?"+articlePath);
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuffer contents = new StringBuffer();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            char [] buffer = new char[256];
            int length = 0;
            while((length = bufferedReader.read(buffer))!=-1){
                contents.append(buffer,0,length);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }
    public List<Articleview> getArticleViews(Integer userId) {
        return articleDao.getArticleViews(userId);
    }

    public Boolean addFriendApplication(User userFrom, String userPhone,String massage) {
        Userlogin userTo = userLoginDao.getUserLoginByPhone(userPhone);
        Integer userToId = userTo.getUserid();
        if(userToId.equals(userFrom.getUserid())){
            return false;
        }
        Friendapplication friendapplication = new Friendapplication();
        friendapplication.setMessage(massage);
        friendapplication.setState("waiting");
        friendapplication.setUserfrom(userFrom.getUserid());
        friendapplication.setUserto(userToId);
        friendapplication.setStartdate(new Date());
        friendApplicationDao.insert(friendapplication);
        return true;
    }

    public List<UserApplication> getUserFromByUserTo(User user) {
        List<Friendapplication> friendApplicaiton = friendApplicationDao.getFriendApplicaiton(user.getUserid());
        if(friendApplicaiton.size() == 0){
            return new ArrayList<>();
        }
        List<Integer> userIds = new ArrayList<>();
        for (Friendapplication application : friendApplicaiton) {
            userIds.add(application.getUserfrom());
        }
        Map<Integer,UserApplication> map= new HashMap<>();

        List<Userlogin> userByUserId = userLoginDao.getUserByUserId(userIds);
        UserApplication userApplication = null;
        for (Userlogin userlogin : userByUserId) {
            userApplication = new UserApplication();
            userApplication.setUseraddress(userlogin.getUseraddress());
            userApplication.setUseremail(userlogin.getUseremail());
            userApplication.setUsername(userlogin.getUsername());
            userApplication.setUsersex(userlogin.getUserphone());
            userApplication.setUserphone(userlogin.getUserphone());
            map.put(userlogin.getUserid(),userApplication);
        }
        for (Friendapplication friendapplication : friendApplicaiton) {
            UserApplication userApplication1 = map.get(friendapplication.getUserfrom());
            userApplication1.setUsermassage(friendapplication.getMessage());
        }
        List<UserApplication> list= new ArrayList<>();
        map.entrySet();
        for (Map.Entry<Integer, UserApplication> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    public void approveFriendApply(Integer userToId, String userFromPhone) {

        Userlogin userFrom = userLoginDao.getUserLoginByPhone(userFromPhone);
        Integer userFromId = userFrom.getUserid();
        FriendlistKey friendlistKey = new FriendlistKey();

        friendlistKey.setUserfrom(userFromId);
        friendlistKey.setUserto(userToId);
        friendListDao.insert(friendlistKey);
        friendlistKey.setUserto(userFromId);
        friendlistKey.setUserfrom(userToId);
        friendListDao.insert(friendlistKey);
        friendApplicationDao.deleteFriendApplicaiton(userFromId,userToId);
        friendApplicationDao.deleteFriendApplicaiton(userToId,userFromId);
    }
    public void rejectFriendApply(Integer userToId, String userFromPhone) {

        Userlogin userFrom = userLoginDao.getUserLoginByPhone(userFromPhone);
        Integer userFromId = userFrom.getUserid();
        friendApplicationDao.deleteFriendApplicaiton(userFromId,userToId);
        friendApplicationDao.deleteFriendApplicaiton(userToId,userFromId);
    }
}
