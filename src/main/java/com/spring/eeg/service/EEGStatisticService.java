package com.spring.eeg.service;

import com.spring.eeg.mbg.dao.UserlastweekstateMapper;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.mbg.model.UserlastweekstateExample;
import com.spring.eeg.utils.SQLFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Service
public class EEGStatisticService {
    @Autowired
    UserlastweekstateMapper userlastweekstateMapper;

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
        userlastweekstateMapper.insert(userlastweekstate);
    }

    public Userlastweekstate getLastWeekState(Integer userId) {
        UserlastweekstateExample userlastweekstateExample = new UserlastweekstateExample();
        UserlastweekstateExample.Criteria criteria = userlastweekstateExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Userlastweekstate> userLastWeekStates = userlastweekstateMapper.selectByExample(userlastweekstateExample);
        Userlastweekstate userlastweekstate = userLastWeekStates.get(0);
        ZonedDateTime zonedDateTime = userlastweekstate.getLastupdate().toInstant().atZone(ZoneId.systemDefault());
        LocalDate last = zonedDateTime.toLocalDate();
        LocalDate now = LocalDate.now();
        LocalDate lastValidTime = last.plusDays(7);
        if(lastValidTime.isAfter(now)){
            System.out.println("update");
        }
//
//        calendar
//        if()
        return null;
    }

    public void upDateLastWeekState(Integer userId) {

    }
}
