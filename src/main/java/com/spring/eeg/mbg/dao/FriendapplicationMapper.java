package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Friendapplication;
import com.spring.eeg.mbg.model.FriendapplicationExample;
import com.spring.eeg.mbg.model.FriendapplicationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendapplicationMapper {
    long countByExample(FriendapplicationExample example);

    int deleteByExample(FriendapplicationExample example);

    int deleteByPrimaryKey(FriendapplicationKey key);

    int insert(Friendapplication record);

    int insertSelective(Friendapplication record);

    List<Friendapplication> selectByExample(FriendapplicationExample example);

    Friendapplication selectByPrimaryKey(FriendapplicationKey key);

    int updateByExampleSelective(@Param("record") Friendapplication record, @Param("example") FriendapplicationExample example);

    int updateByExample(@Param("record") Friendapplication record, @Param("example") FriendapplicationExample example);

    int updateByPrimaryKeySelective(Friendapplication record);

    int updateByPrimaryKey(Friendapplication record);
}