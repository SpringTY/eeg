package com.spring.eeg;

import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.dao.UserloginMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class EegApplicationTests {
    @Autowired
    UserloginMapper userloginMapper;
    @Autowired
    UserLoginDao userLoginDao;
    @Autowired
    EegfilelistMapper eegfilelistMapper;
    @Test
    void contextLoads() {
//        UserloginExample userloginExample = new UserloginExample();
////        userloginMapper.selectByExample(userloginExample);
////        UserloginExample.Criteria criteria = userloginExample.createCriteria();
////        criteria.andUserphoneEqualTo("userPhone");
////        List<Userlogin> userLogins = userloginMapper.selectByExample(userloginExample);
////        System.out.println(userLogins);
//        Userlogin userLoginByPhone = userLoginDao.getUserLoginByPhone("0");
//        String encode = new BCryptPasswordEncoder().encode("1");
//        System.out.println(encode);
//        System.out.println(userLoginByPhone);
        List<Eegfilelist> eegfilelists = eegfilelistMapper.selectByExample(new EegfilelistExample());
        System.out.println(eegfilelists);
    }

}
