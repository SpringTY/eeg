package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.FriendapplicationMapper;
import com.spring.eeg.mbg.model.Friendapplication;
import com.spring.eeg.mbg.model.FriendapplicationExample;
import com.spring.eeg.mbg.model.FriendapplicationKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FriendApplicationDao {
    @Autowired
    FriendapplicationMapper friendapplicationMapper;
    public void insert(Friendapplication friendapplication){
        friendapplicationMapper.insert(friendapplication);
    }
    public List<Friendapplication> getFriendApplicaiton(Integer userId){
        FriendapplicationExample friendapplicationExample = new FriendapplicationExample();
        FriendapplicationExample.Criteria criteria = friendapplicationExample.createCriteria();
        criteria.andUsertoEqualTo(userId);
        return friendapplicationMapper.selectByExample(friendapplicationExample);
    }
    public void deleteFriendApplicaiton(Integer userFrom ,Integer userTo){
        FriendapplicationKey friendapplicationKey = new FriendapplicationKey();
        friendapplicationKey.setUserfrom(userFrom);
        friendapplicationKey.setUserto(userTo);
        friendapplicationMapper.deleteByPrimaryKey(friendapplicationKey);
    }

}
