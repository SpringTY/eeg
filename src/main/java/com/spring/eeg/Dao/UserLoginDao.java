package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.UserloginMapper;
import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.mbg.model.UserloginExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserLoginDao {
    @Autowired
    UserloginMapper userloginMapper;

    public Userlogin getUserLoginByPhone(String userPhone) {
        UserloginExample userloginExample = new UserloginExample();
        UserloginExample.Criteria criteria = userloginExample.createCriteria();
        criteria.andUserphoneEqualTo(userPhone);
        List<Userlogin> userlogins = userloginMapper.selectByExample(userloginExample);
        if (userlogins.size() == 0) {
            return null;
        }
        return userlogins.get(0);
    }
    public List<Userlogin> getUserByUserId(List<Integer> UserId) {
        UserloginExample userloginExample = new UserloginExample();
        UserloginExample.Criteria criteria = userloginExample.createCriteria();
        criteria.andUseridIn(UserId);
        List<Userlogin> userlogins = userloginMapper.selectByExample(userloginExample);
        return userlogins;
    }
    public Integer insertUserLogin(Userlogin userLogin) {
        return userloginMapper.insertSelective(userLogin);
    }
}
