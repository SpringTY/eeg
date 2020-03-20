package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Articleview;
import com.spring.eeg.mbg.model.ArticleviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleviewMapper {
    long countByExample(ArticleviewExample example);

    int deleteByExample(ArticleviewExample example);

    int insert(Articleview record);

    int insertSelective(Articleview record);

    List<Articleview> selectByExample(ArticleviewExample example);

    int updateByExampleSelective(@Param("record") Articleview record, @Param("example") ArticleviewExample example);

    int updateByExample(@Param("record") Articleview record, @Param("example") ArticleviewExample example);
}