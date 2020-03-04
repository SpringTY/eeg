package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.mbg.model.UserloginExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserloginMapper {
    long countByExample(UserloginExample example);

    int deleteByExample(UserloginExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    List<Userlogin> selectByExample(UserloginExample example);

    Userlogin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByExample(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
}