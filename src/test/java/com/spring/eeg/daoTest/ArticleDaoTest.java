package com.spring.eeg.daoTest;


import com.spring.eeg.Dao.ArticleDao;
import com.spring.eeg.mbg.model.Articleview;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {
    @Autowired
    ArticleDao articleDao;
    @Test
    public void contextLoads() {
        List<Articleview> articleViews = articleDao.getArticleViews(10);
        System.out.println(articleViews);
    }
}
