package com.spring.eeg.service;

import com.spring.eeg.Dao.EegFileListDao;
import com.spring.eeg.Dao.LearnStateDao;
import com.spring.eeg.Dao.UserLastWeekStateDao;
import com.spring.eeg.Model.EEGTime;
import com.spring.eeg.mbg.dao.LearnstateMapper;
import com.spring.eeg.mbg.dao.UserlastweekstateMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.Learnstate;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.mbg.model.UserlastweekstateExample;
import com.spring.eeg.utils.DateUtil;
import com.spring.eeg.utils.SQLFormat;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Arrays;
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
    private boolean isLastUpdateInValid(Date lastUpdateDate){
        // 对应localDate
        LocalDate last = DateUtil.toLocalDate(lastUpdateDate);
        LocalDate now = LocalDate.now();
        // 有效期
        LocalDate lastValidTime = last.plusDays(7);
        return lastValidTime.isBefore(now);
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
//        if(isLastUpdateInValid(lastUpdate)){
//            System.out.println("update");
        //
            upDateLastWeekState(userId);
//        }
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
            attentionTime +=learnstate.getAttentiontime();
            totalTime+=learnstate.getTotaltime();
        }
        System.out.println(2);

        return new EEGTime(totalTime, attentionTime,totalTime - attentionTime);
    }

    public List<List> getLearnStateCurrentYear(Integer userId){
        return getLearnState(userId,LocalDate.now());
    }

    /**
     * 返回给Echarts 必须是数组
     * @param userId
     * @param date
     * @return
     */
    public List<List> getLearnState(Integer userId, LocalDate date){
        LocalDate firstDayOfLastYear = date.with(TemporalAdjusters.firstDayOfYear());
        LocalDate lastDayOfLastYear = date.with(TemporalAdjusters.lastDayOfYear());
        List<Learnstate> learnStateBetweenDate = learnStateDao.getLearnStateBetweenDate(userId,
                DateUtil.toUtilDate(firstDayOfLastYear),
                DateUtil.toUtilDate(lastDayOfLastYear));
        List<List> learnStates= new ArrayList<>();
        for (Learnstate learnstate : learnStateBetweenDate) {
            Date learnDate = learnstate.getLearndate();
            LocalDate localDate = DateUtil.toLocalDate(learnDate);
            String dateString = localDate.toString();
            learnStates.add(Arrays.asList(dateString,learnstate.getTotaltime()));
        }
        return learnStates;
    }

    /**
     * 上传记录后为 某天添加新的学习时间
     * @param userId
     * @param AttentionTime
     * @param totalTime
     * @param date
     */
    public void addLearnStateTime(Integer userId, Integer AttentionTime,Integer totalTime,Date date){
        Learnstate learnstate = learnStateDao.getLearnStateByIdAndDate(userId,date);
        AttentionTime /= 60;
        totalTime /= 60;
        if(learnstate == null){
            learnstate = new Learnstate();
            learnstate.setTotaltime(totalTime);
            learnstate.setAttentiontime(AttentionTime);
            learnstate.setUserid(userId);
            learnstate.setLearndate(date);
            learnStateDao.insert(learnstate);
        }else{
            // 计算新的时间
            Integer previousTotalTime = learnstate.getTotaltime();
            Integer previousAttentionTime = learnstate.getAttentiontime();
            learnstate.setAttentiontime(previousAttentionTime + AttentionTime);
            learnstate.setTotaltime(previousTotalTime + totalTime);
            // 开始更新
            learnStateDao.updateLearnStateByUserIdAndDate(learnstate);
        }
    }

}
