package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.ArticleMapper;
import com.spring.eeg.mbg.dao.ArticleviewMapper;
import com.spring.eeg.mbg.model.Article;
import com.spring.eeg.mbg.model.ArticleExample;
import com.spring.eeg.mbg.model.Articleview;
import com.spring.eeg.mbg.model.ArticleviewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDao {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    ArticleviewMapper articleviewMapper;
    public void insertArticle(Article article){
        int insert = articleMapper.insert(article);
    }
    public List<Article> getArticles(){
        return articleMapper.selectByExample(new ArticleExample());
    }
    public List<Article> getArticles(Integer userId){
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return articleMapper.selectByExample(articleExample);
    }
    public List<Articleview> getArticleViews(Integer userId){
        ArticleviewExample articleviewExample = new ArticleviewExample();
        ArticleviewExample.Criteria criteria = articleviewExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        articleviewExample.setOrderByClause("articleId desc");
        return articleviewMapper.selectByExample(articleviewExample);
    }

    public Article getArticle(Integer articleId){
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();

        criteria.andArticleidEqualTo(articleId);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        if(articles.size() ==0){
            return null;
        }
        return articles.get(0);
    }

    public void updateArticle(Article article) {
        articleMapper.updateByPrimaryKey(article);
    }
}
