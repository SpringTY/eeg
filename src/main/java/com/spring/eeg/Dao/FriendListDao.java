package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.FriendlistMapper;
import com.spring.eeg.mbg.model.FriendlistKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FriendListDao {
    @Autowired
    FriendlistMapper friendlistMapper;
    public void insert(FriendlistKey friendlistKey){
        friendlistMapper.insert(friendlistKey);
    }
}
