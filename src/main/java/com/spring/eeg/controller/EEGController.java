package com.spring.eeg.controller;

import com.spring.eeg.Model.EEGTime;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.service.EEGStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EEGController {
    @Autowired
    EEGStatisticService eegStatisticService;

    @ResponseBody
    @RequestMapping(value = "/getLastWeekEveryDay")
    public Userlastweekstate getLastWeekState() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Userlastweekstate lastWeekState = eegStatisticService.getLastWeekState(user.getUserid());
        return lastWeekState;
    }
    @ResponseBody
    @RequestMapping(value ="/getLastWeekEEGTime")
    public EEGTime getLastWeekEEGTime(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return eegStatisticService.getLastWeekEEGTime(user.getUserid());
    }
}
