package com.spring.eeg.service;

import com.spring.eeg.Dao.LearnStateDao;
import com.spring.eeg.Dao.UserLastWeekStateDao;
import com.spring.eeg.Model.EEGTime;
import com.spring.eeg.mbg.dao.UserlastweekstateMapper;
import com.spring.eeg.mbg.model.Learnstate;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.mbg.model.UserlastweekstateExample;
import com.spring.eeg.utils.DateUtil;
import com.spring.eeg.utils.SQLFormat;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Service
public class EEGStatisticService {
    @Autowired
    UserLastWeekStateDao userLastWeekStateDao;
    @Autowired
    LearnStateDao learnStateDao;
    /**
     * 新增用户初始化本周状态信息
     * @param userId
     */
    public void initLastWeekState(Integer userId) {
        Userlastweekstate userlastweekstate = new Userlastweekstate();
        userlastweekstate.setUserid(userId);
        userlastweekstate.setLastupdate(SQLFormat.toSqlDate(new Date()));
        userlastweekstate.setMondayattentiontime(0);
        userlastweekstate.setMondaytotaltime(0);
        userlastweekstate.setTuesdayattentiontime(0);
        userlastweekstate.setTuesdaytotaltime(0);
        userlastweekstate.setWednesdayattentiontime(0);
        userlastweekstate.setWednesdaytotaltime(0);
        userlastweekstate.setThursdayattentiontime(0);
        userlastweekstate.setThursdaytotaltime(0);
        userlastweekstate.setFridayattentiontime(0);
        userlastweekstate.setFridaytotaltime(0);
        userlastweekstate.setSaturdayattentiontime(0);
        userlastweekstate.setSaturdaytotaltime(0);
        userlastweekstate.setSundayattentiontime(0);
        userlastweekstate.setSundaytotaltime(0);
        userLastWeekStateDao.insert(userlastweekstate);
    }

    /**
     * 得到上周信息
     * @param userId
     * @return userLastWeekState
     */
    public Userlastweekstate getLastWeekState(Integer userId) {
        Userlastweekstate userlastweekstate = userLastWeekStateDao.getUserLastWeekState(userId);
        //上次状态更新日期
        Date lastUpdate = userlastweekstate.getLastupdate();
        // 对应localDate
        LocalDate last = DateUtil.toLocalDate(lastUpdate);
        LocalDate now = LocalDate.now();
        // 有效期
        LocalDate lastValidTime = last.plusDays(7);

        if(lastValidTime.isBefore(now)){
            System.out.println("update");
            upDateLastWeekState(userId);
        }

        return userLastWeekStateDao.getUserLastWeekState(userId);
    }

    public void upDateLastWeekState(Integer userId) {
        List<Learnstate> learnStateBetweenDate = getLastWeekLearnState(userId);
        Userlastweekstate userlastweekstate = new Userlastweekstate(userId,
                0,0,0,
                0,0,0,
                0,0,0,
                0,0,0,
                0,0,new Date());
        for (Learnstate learnstate : learnStateBetweenDate) {
            Date learndate = learnstate.getLearndate();
            LocalDate date = DateUtil.toLocalDate(learndate);
            if(date.getDayOfWeek().equals(DayOfWeek.MONDAY)){
                userlastweekstate.setMondayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setMondaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.TUESDAY)){
                userlastweekstate.setTuesdayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setTuesdaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)){
                userlastweekstate.setWednesdayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setWednesdaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.THURSDAY)){
                userlastweekstate.setThursdayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setThursdaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.THURSDAY)){
                userlastweekstate.setThursdayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setThursdaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                userlastweekstate.setFridayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setFridaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                userlastweekstate.setSaturdayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setSaturdaytotaltime(learnstate.getTotaltime());
            }else if(date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                userlastweekstate.setSundayattentiontime(learnstate.getAttentiontime());
                userlastweekstate.setSundaytotaltime(learnstate.getTotaltime());
            }
        }
        userLastWeekStateDao.updateByUserId(userlastweekstate);
        //System.out.println(learnStateBetweenDate);
    }
    private List<Learnstate> getLastWeekLearnState(Integer userId){
        LocalDate now = LocalDate.now();
        LocalDate sunday= DateUtil.getLastWeekSundayDate(now);
        LocalDate monday = sunday.minusDays(6);
        System.out.println(sunday.getDayOfWeek()+"sunday");
        System.out.println(monday.getDayOfWeek()+"monday");
        return learnStateDao.getLearnStateBetweenDate(userId, DateUtil.toUtilDate(monday), DateUtil.toSqlDate(sunday));
    }
    public EEGTime getLastWeekEEGTime(Integer userId){
        List<Learnstate> lastWeekLearnState = getLastWeekLearnState(userId);
        int attentionTime = 0;
        int totalTime = 0;

        for (Learnstate learnstate : lastWeekLearnState) {
            attentionTime+=learnstate.getAttentiontime();
            totalTime+=learnstate.getTotaltime();
        }
        return new EEGTime(totalTime, attentionTime);
    }
}
