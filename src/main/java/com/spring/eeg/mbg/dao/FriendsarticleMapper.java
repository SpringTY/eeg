package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Friendsarticle;
import com.spring.eeg.mbg.model.FriendsarticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsarticleMapper {
    long countByExample(FriendsarticleExample example);

    int deleteByExample(FriendsarticleExample example);

    int insert(Friendsarticle record);

    int insertSelective(Friendsarticle record);

    List<Friendsarticle> selectByExample(FriendsarticleExample example);

    int updateByExampleSelective(@Param("record") Friendsarticle record, @Param("example") FriendsarticleExample example);

    int updateByExample(@Param("record") Friendsarticle record, @Param("example") FriendsarticleExample example);
}