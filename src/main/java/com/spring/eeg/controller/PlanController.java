package com.spring.eeg.controller;

import com.spring.eeg.Dao.PlanDao;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Lastweekview;
import com.spring.eeg.mbg.model.Plan;
import com.spring.eeg.mbg.model.Planstat;
import com.spring.eeg.mbg.model.Planstatplus;
import com.spring.eeg.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class PlanController {
    @Autowired
    PlanService planService;
    @RequestMapping(value = "/planList")
    public String planList(){

        return "PlanList.html";
    }
    @PostMapping(value = "/newPlan")
    @ResponseBody
    public String newPlan(@RequestParam("planTitle") String planTitle,
                          @RequestParam("description") String description,
                          @RequestParam("attentionTime") Integer attentionTime,
                          @RequestParam("important") String important){
        log.debug(planTitle);
        log.debug(description);
        log.debug(attentionTime.toString());
        log.debug(important);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        attentionTime = attentionTime * 60;
        planService.createNewPlan(planTitle,description,attentionTime,important,user);
        return "success";
    }
    @RequestMapping(value = "/getPlans")
    @ResponseBody
    public List<Plan> getPlans(){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return null;
        }
        return planService.getPlans(user);
    }
    @RequestMapping(value = "/finishPlan/{planId}")
    @ResponseBody
    public boolean finishPlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.finishPlan(user,planId);
    }
    @RequestMapping(value = "/unFinishPlan/{planId}")
    @ResponseBody
    public boolean unFinishPlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.unFinishPlan(user,planId);
    }
    @RequestMapping(value = "/importantPlan/{planId}")
    @ResponseBody
    public boolean importantPlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.importantPlan(user,planId);
    }
    @RequestMapping(value = "/unimportantPlan/{planId}")
    @ResponseBody
    public boolean unimportantPlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.unimportantPlan(user,planId);
    }
    @RequestMapping(value = "/revivePlan/{planId}")
    @ResponseBody
    public boolean revivePlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.revivePlan(user,planId);
    }
    @RequestMapping(value = "/trashPlan/{planId}")
    @ResponseBody
    public boolean trashPlan(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.trashPlan(user,planId);
    }
    @RequestMapping(value = "/deletePlanPermanently/{planId}")
    @ResponseBody
    public boolean deletePlanPermanently(@PathVariable("planId") Integer planId){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            return false;
        }
        return planService.deletePlanPermanently(user,planId);
    }
    @RequestMapping(value = "/getLastWeekStatistic")
    @ResponseBody
    public Planstat getLastWeekStatistic(){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){

        }
        return planService.getLastWeekStatistic(user.getUserid());
    }
    @RequestMapping(value = "/getRecentPlans")
    @ResponseBody
    public List<Plan> getRecentPlans(){
        User user = null;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){

        }
        return planService.getRecentPlans(user.getUserid());
    }

    @RequestMapping(value = "/getFriendsPlanRank")
    @ResponseBody
    public List<Planstatplus> getFriendsPlanRank(){
        User user = null;
        user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return planService.getFriendsPlanRank(user.getUserid());
    }
    @RequestMapping(value = "/getFriendsWeekRank")
    @ResponseBody
    public List<Lastweekview> getFriendsWeekRank(){
        User user = null;
        user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return planService.getFriendsWeekRank(user.getUserid());
    }
}
