package com.spring.eeg.controller;

import com.spring.eeg.Model.EEGTime;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.service.EEGFileService;
import com.spring.eeg.service.EEGStatisticService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Slf4j
@Controller
public class EEGController {
    @Autowired
    EEGStatisticService eegStatisticService;
    @Autowired
    EEGFileService eegFileService;
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
        EEGTime lastWeekEEGTime = eegStatisticService.getLastWeekEEGTime(user.getUserid());
        log.debug("TAG:getLastWeekEEGTime:"+lastWeekEEGTime.toString());
        return lastWeekEEGTime;
    }
    @ResponseBody
    @RequestMapping(value ="/getCurrentYearLearnTime")
    public List<List> getCurrentYearLearnTime(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return eegStatisticService.getLearnStateCurrentYear(user.getUserid());
    }
    @ResponseBody
    @RequestMapping(value = "/getFileList")
    public List<Eegfilelist> getFileList(){
        return eegFileService.getCurrentFileList(SecurityContextHolder.getContext().getAuthentication());
    }
    @RequestMapping(value = "/EEGFile/{fileId}")
    public String EEGFile(@PathVariable("fileId") String fileId){

        return null;
    }

}
