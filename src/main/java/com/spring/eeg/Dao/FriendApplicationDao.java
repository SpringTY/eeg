package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.FriendapplicationMapper;
import com.spring.eeg.mbg.model.Friendapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FriendApplicationDao {
    @Autowired
    FriendapplicationMapper friendapplicationMapper;
    public void insert(Friendapplication friendapplication){
        friendapplicationMapper.insert(friendapplication);
    }

}
