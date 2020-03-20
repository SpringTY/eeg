package com.spring.eeg;

import com.spring.eeg.Dao.ArticleDao;
import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.dao.UserloginMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.service.EEGStatisticService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.transform.Source;
import java.time.LocalDate;
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
    @Autowired
    EEGStatisticService eegStatisticService;
    @Autowired
    ArticleDao articleDao;
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
    }
    @Test
    void testEEGLastWeek(){
//        System.out.println(1);
//        Userlastweekstate lastWeekState = eegStatisticService.getLastWeekState(10);
        System.out.println(LocalDate.now());
    }
}
