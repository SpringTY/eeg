package com.spring.eeg.Model;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleView {
    Integer articleId;
    String  articleName;
    Date uploadDate;
    Date updateDate;
    String authority;
}
