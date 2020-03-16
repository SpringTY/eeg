package com.spring.eeg.controller;

import com.spring.eeg.Model.ArticleView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
public class SocialController {
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
        return "/index";
    }
    @RequestMapping(value = "/getArticleList",produces="application/json;charset=UTF-8")
    @ResponseBody
    public List<ArticleView> getArticleList(){
        ArticleView articleView = new ArticleView();
        articleView.setArticleId(1);
        String name  ="如何提高效率";
        articleView.setArticleName(name);
        articleView.setAuthority("friends");
        articleView.setUpdateDate(new Date());
        articleView.setUploadDate(new Date());
        List<ArticleView> list = new ArrayList<>();
        list.add(articleView);
        return list;
    }
}
