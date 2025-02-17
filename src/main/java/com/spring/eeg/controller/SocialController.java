package com.spring.eeg.controller;

import com.spring.eeg.Model.*;
import com.spring.eeg.mbg.model.Articleview;
import com.spring.eeg.mbg.model.ClassTable;
import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.service.PlanService;
import com.spring.eeg.service.SocialService;
import com.spring.eeg.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class SocialController {
    @Autowired
    SocialService socialService;
    @Autowired
    UserService userService;
    @Autowired
    PlanService planService;
    @RequestMapping(value = "/articleEditor")
    public String articleEditor() {
        return "ArticleEdit.html";
    }

    @PostMapping(value = "/newArticle")
    public String newArticle(@RequestParam(name = "title") String title,
                             @RequestParam(name = "contents") String contents,
                             @RequestParam(name = "authority") String authority) {
        log.info(title);
        log.info(authority);
        log.info(contents);
        User user =userService.getCurrentUser();
        if(user == null){
            return "/error403";
        }
        socialService.insertArticle(title, contents, authority, user.getUserid());
        return "redirect:/index";
    }

    @PostMapping(value = "/editArticle")
    @ResponseBody
    public String editArticle(@RequestParam(name = "title") String title,
                              @RequestParam(name = "contents") String contents,
                              @RequestParam(name = "authority") String authority,
                              @RequestParam(name = "articleId") Integer articleId
    ) {
        log.info(title);
        log.info(authority);
        log.info(contents);
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        socialService.updateArticle(title, contents, authority, user.getUserid(), articleId);
        return "ok";
    }

    @RequestMapping(value = "/getArticleList", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Articleview> getArticleList() {
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        List<Articleview> articleViews = socialService.getArticleViews(user.getUserid());
        log.info(articleViews.toString());
        return articleViews;
    }

    @RequestMapping(value = "/articleList")
    public String articleList() {
        return "ArticleList.html";
    }

    @RequestMapping(value = "/article/{articleId}")
    public String checkArticle(@PathVariable("articleId") Integer articleId, Map<String, Object> map) {
        ArticleJson articleJson = socialService.EditArticle(articleId);
        map.put("article", articleJson);
        map.put("articleId", articleId);
        return "ArticleReEdit.html";
    }

    @RequestMapping(value = "/FriendsList")
    public String friendsList() {

        return "FriendsList.html";
    }

    @RequestMapping(value = "/NewFriends")
    public String newFriends() {
        return "NewFriends.html";
    }

    @RequestMapping(value = "/searchUsers")
    public String searchUsers(@RequestParam("userName") String userName,
                              @RequestParam("userPhone") String userPhone, Map<String, Object> map) {
        List<Userlogin> list = userService.getUserByPhoneAndName(userName, userPhone);
        map.put("friends", list);
        return "FriendsList.html";
    }

    @RequestMapping(value = "/applyFriends")
    @ResponseBody
    public Boolean applyFriends(@RequestParam("userPhone") String userPhone,
                                @RequestParam("reason") String massage) {
        log.info(userPhone);
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        Boolean result = socialService.addFriendApplication(user, userPhone, massage);
        return result;
    }

    @RequestMapping(value = "/ApplicationList")
    public String ApplicationList(Map<String, Object> map) {
        User user =userService.getCurrentUser();
        if(user == null){
            return "/error403";
        }
        List<UserApplication> fromTos = socialService.getUserFromByUserTo(user);
        map.put("friends", fromTos);
        return "FriendsApplication.html";
    }

    @RequestMapping(value = "/ApproveFriendApply")
    @ResponseBody
    public String approveFriendApply(@RequestParam("userPhone") String userPhone) {
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        socialService.approveFriendApply(user.getUserid(), userPhone);

        return "FriendsApplication.html";
    }

    @RequestMapping(value = "/RejectFriendApply")
    @ResponseBody
    public String rejectFriendApply(@RequestParam("userPhone") String userPhone) {
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        socialService.rejectFriendApply(user.getUserid(), userPhone);

        return "FriendsApplication.html";
    }

    @RequestMapping(value = "/ArticleRead")
    public String ArticleRead() {

        return "ArticleRead.html";
    }

    @RequestMapping(value = "/socialArticles")
    @ResponseBody
    public List<ArticleJsonDisplay> getArticles() {
        User user =userService.getCurrentUser();
        if(user == null){
            return null;
        }
        return socialService.getSocialArticles(user.getUserid());
    }

    @RequestMapping(value = "/socialRank")
    public String socialRank(){
        return "socialRank.html";
    }
    @RequestMapping(value = "/currentFriends")
    public String currentFriends(Map<String,Object>map){
        User user = null;
        user = userService.getCurrentUser();
        if(user == null) {
            return "/error403";
        }
        Integer userId = user.getUserid();
        List<Userlogin> friends = socialService.getFriends(userId);

        map.put("friends",friends);
        return "FriendsListAdded.html";
    }
    @PostMapping(value = "/removeFriends")
    @ResponseBody
    public String removeFriends(@RequestParam("userId")Integer userId){
        User currentUser = userService.getCurrentUser();
        if(currentUser==null){
            return "error";
        }
        Integer userIdM = currentUser.getUserid();
        socialService.removeFriend(userId,userIdM);
        return "success";
    }
    @RequestMapping(value = "/myClasses")
    public String myClasses(Map<String,Object>map){
        User user = null;
        user = userService.getCurrentUser();
        if(user == null) {
            return "/error403";
        }
        Integer userId = user.getUserid();
        List<ClassTable> classes = socialService.getClasses(userId);

        map.put("classes",classes);
        return "ClassListStudent.html";
    }
}
