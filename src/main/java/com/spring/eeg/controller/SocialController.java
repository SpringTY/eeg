package com.spring.eeg.controller;

import com.spring.eeg.Model.ArticleJson;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Articleview;
import com.spring.eeg.mbg.model.Userlogin;
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
    @RequestMapping(value = "/articleEditor")
    public String articleEditor(){
        return "ArticleEdit.html";
    }
    @PostMapping(value = "/newArticle")
    public String newArticle(@RequestParam(name = "title") String title,
                             @RequestParam(name = "contents") String contents,
                             @RequestParam(name = "authority") String authority){
        log.info(title);
        log.info(authority);
        log.info(contents);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        socialService.insertArticle(title,contents,authority,user.getUserid());
        return "redirect:/index";
    }
    @PostMapping(value = "/editArticle")
    @ResponseBody
    public String editArticle(@RequestParam(name = "title") String title,
                             @RequestParam(name = "contents") String contents,
                             @RequestParam(name = "authority") String authority,
                              @RequestParam(name = "articleId") Integer articleId
    ){
        log.info(title);
        log.info(authority);
        log.info(contents);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        socialService.updateArticle(title,contents,authority,user.getUserid(),articleId);
        return "ok";
    }
    @RequestMapping(value = "/getArticleList",produces="application/json;charset=UTF-8")
    @ResponseBody
    public List<Articleview> getArticleList(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return socialService.getArticleViews(user.getUserid());
    }
    @RequestMapping(value = "/articleList")
    public String articleList(){
        return "ArticleList.html";
    }
    @RequestMapping(value = "/article/{articleId}")
    public String checkArticle(@PathVariable("articleId") Integer articleId, Map<String,Object> map){
        ArticleJson articleJson = socialService.EditArticle(articleId);
        map.put("article",articleJson);
        map.put("articleId",articleId);
        return "ArticleReEdit.html";
    }
    @RequestMapping(value = "/FriendsList")
    public String friendsList(){

        return "FriendsList.html";
    }
    @RequestMapping(value = "/NewFriends")
    public String newFriends(){
        return "NewFriends.html";
    }

    @RequestMapping(value = "/searchUsers")
    public String searchUsers(@RequestParam("userName") String userName,
                                       @RequestParam("userPhone") String userPhone,Map<String,Object> map){
        List<Userlogin> list =userService.getUserByPhoneAndName(userName,userPhone);
        map.put("friends",list);
        return "FriendsList.html";
    }
    @RequestMapping(value = "/applyFriends")
    @ResponseBody
    public String applyFriends(@RequestParam ("userPhone") String userPhone,
                               @RequestParam ("reason") String massage){
        log.info(userPhone); User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        socialService.addFriendApplication(user,userPhone,massage);
        return "success";
    }

}
