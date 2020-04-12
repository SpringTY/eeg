package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.FriendlistMapper;
import com.spring.eeg.mbg.model.FriendlistExample;
import com.spring.eeg.mbg.model.FriendlistKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FriendListDao {
    @Autowired
    FriendlistMapper friendlistMapper;
    public void insert(FriendlistKey friendlistKey){
        friendlistMapper.insert(friendlistKey);
    }

    /**
     * friendTo is the friends
     * @param userId
     * @return
     */
    public List<FriendlistKey> getFriends(Integer userId) {
        FriendlistExample friendlistExample = new FriendlistExample();
        FriendlistExample.Criteria criteria = friendlistExample.createCriteria();
        criteria.andUserfromEqualTo(userId);
        return friendlistMapper.selectByExample(friendlistExample);
    }

    public void remove(Integer userId, Integer userIdM) {
        FriendlistKey friendlistKey = new FriendlistKey();
        friendlistKey.setUserfrom(userIdM);
        friendlistKey.setUserto(userId);
        friendlistMapper.deleteByPrimaryKey(friendlistKey);
        friendlistKey.setUserto(userIdM);
        friendlistKey.setUserfrom(userId);
        friendlistMapper.deleteByPrimaryKey(friendlistKey);
    }
}
