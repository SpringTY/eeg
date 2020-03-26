package com.spring.eeg.controller;

import com.spring.eeg.Model.EEGTime;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.service.EEGFileService;
import com.spring.eeg.service.EEGStatisticService;
import com.spring.eeg.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @RequestMapping(value = "/document")
    public String document(Map<String, Object> map){
        System.out.println("/document + TAG");
        return "document.html";
    }
    @RequestMapping(value = "/fileAnalysisResult")
    public String fileAnalysisResult(){

        return "fileAnalysisResult.html";
    }
    @RequestMapping(value = "/newEEGFile")
    public String newEEGFile(){

        return "newEEGFile.html";
    }
    @RequestMapping(value = "/uploadEEGFile")
    @ResponseBody
    public String uploadEEGFile(@RequestParam("planId") Integer planId,
                                @RequestParam("fileTitle") String fileTitle,
                                @RequestParam("uploadDate") String uploadDate,
                                @RequestParam("info") String info,
                                @RequestParam("EEGFile") MultipartFile[] EEGFile,
                                HttpServletRequest request,Map<String,Object>map){
//        log.info(fileTitle);
//        log.info(planId.toString());
//        log.info(uploadDate.toString());
//        log.info(info.toString());
//        log.info(String.valueOf(EEGFile.length));
        if(EEGFile.length==0){
            return "error.html";
        }
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer FileId = eegFileService.analysis(planId,user.getUserid(),fileTitle,uploadDate,info,EEGFile);
        return FileId.toString();
    }
}
