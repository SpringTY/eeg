package com.spring.eeg.Model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class ArticleView {
    Integer articleId;
    String  articleName;
    @JSONField(format = "yyyy年MM月dd日")
    Date uploadDate;
    @JSONField(format = "yyyy年MM月dd日")
    Date updateDate;
    String authority;
}
