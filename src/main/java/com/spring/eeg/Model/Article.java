package com.spring.eeg.Model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    Integer articleId;
    Integer userId;
    String  articleName;
    Date uploadDate;
    Date updateDate;
    String authority;
    String articlePath;
}
