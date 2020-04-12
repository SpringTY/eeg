package com.spring.eeg.service;

import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.dao.UserloginMapper;
import com.spring.eeg.mbg.model.Userlogin;
import com.spring.eeg.mbg.model.UserloginExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.List;
@Slf4j
@Service
public class UserService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserLoginDao userLoginDao;
    @Autowired
    EEGStatisticService EEGStatisticService;
    @Autowired
    UserloginMapper userloginMapper;

    public  Userlogin getUser(Integer userId) {
        return userloginMapper.selectByPrimaryKey(userId);
    }

    public void registerNormalUser(Userlogin userlogin) {
        userlogin.setUserrole("user");
        String password = userlogin.getUserpassword();
        String passwordEncode = passwordEncoder.encode(password);
        userlogin.setUserpassword(passwordEncode);
        // User存入数据库
        userLoginDao.insertUserLogin(userlogin);
        // 实在没解决mybatis 自动生成主键的返回值，按照网上方法没生效
        // 所以第二次查询数据库 以后解决 这样效率很低
        String userphone = userlogin.getUserphone();
        Userlogin userLoginByPhone = userLoginDao.getUserLoginByPhone(userphone);
        Integer userid = userLoginByPhone.getUserid();
        // 初始状态存入数据库
        EEGStatisticService.initLastWeekState(userid);
    }
    public User getCurrentUser(){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return null;
        }
        return  user;
    }
    public List<Userlogin> getUserByPhoneAndName(String userName, String userPhone) {
        UserloginExample userloginExample = new UserloginExample();
        UserloginExample.Criteria criteria = userloginExample.createCriteria();
        if(userName!= null && userName.equals("")==false){
            criteria.andUsernameEqualTo(userName);
        }
        List<Userlogin> users = userloginMapper.selectByExample(userloginExample);
        if(userPhone!=null && userPhone.equals("")==false){
            criteria.andUserphoneEqualTo(userPhone);
        }else{
        }
//        String phone;
//        for (Userlogin user : users) {
//            phone = user.getUserphone();
//            log.info(phone);
//            user.setUserphone(phone.substring(0,3)+"****"+phone.substring(6,10));
//        }
        return users;
    }
}
