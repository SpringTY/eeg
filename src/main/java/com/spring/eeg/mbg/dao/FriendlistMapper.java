package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.FriendlistExample;
import com.spring.eeg.mbg.model.FriendlistKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FriendlistMapper {
    long countByExample(FriendlistExample example);

    int deleteByExample(FriendlistExample example);

    int deleteByPrimaryKey(FriendlistKey key);

    int insert(FriendlistKey record);

    int insertSelective(FriendlistKey record);

    List<FriendlistKey> selectByExample(FriendlistExample example);

    int updateByExampleSelective(@Param("record") FriendlistKey record, @Param("example") FriendlistExample example);

    int updateByExample(@Param("record") FriendlistKey record, @Param("example") FriendlistExample example);
}