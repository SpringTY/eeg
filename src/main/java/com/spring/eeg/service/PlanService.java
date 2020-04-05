package com.spring.eeg.service;

import com.spring.eeg.Dao.PlanDao;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PlanService {
    @Autowired
    PlanDao planDao;
    public void createNewPlan(String planTitle, String description, Integer attentionTime, String important, User user) {
        Plan plan = new Plan();
        plan.setFinished("false");
        plan.setImportant(important);
        plan.setPlandate(new Date());
        plan.setPlandescription(description);
        plan.setPlanname(planTitle);
        plan.setPlantime(attentionTime);
        plan.setRealtime(0);
        plan.setTrash("false");
        plan.setUserid(user.getUserid());
        plan.setPlaninfo("");
        planDao.insert(plan);
    }

    public List<Plan> getPlans(User user){
        List<Plan> plans = planDao.getPlans(user.getUserid());
        for (Plan plan : plans) {
            plan.setRealtime(plan.getRealtime()/60);
            plan.setPlantime(plan.getPlantime()/60);
        }
        return plans;
    }

    private boolean operationValid(User user,Integer planId){
        Plan plan = planDao.getPlan(planId);
        return plan.getPlanid().equals(planId);
    }
    public boolean finishPlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateFinished(planId,"true");
        }
        return true;
    }

    public boolean unFinishPlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateFinished(planId,"false");
        }
        return true;
    }

    public boolean importantPlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateImportant(planId,"true");
        }
        return true;
    }

    public boolean unimportantPlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateImportant(planId,"false");
        }
        return true;
    }

    public boolean revivePlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateTrash(planId,"false");
        }
        return true;
    }

    public boolean trashPlan(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.updateTrash(planId,"true");
        }
        return true;
    }

    public boolean deletePlanPermanently(User user, Integer planId) {
        boolean valid = operationValid(user, planId);
        if (valid == false) {
            return false;
        }else{
            planDao.deletePlan(planId);
        }
        return true;
    }
    public void addPlanTime(Integer realTimeAddMin,Integer planId){
        Plan plan = planDao.getPlan(planId);
        Integer realtimeMin = plan.getRealtime() + realTimeAddMin;
        Integer planTime = plan.getPlantime();
        if(realtimeMin>=planTime){
            plan.setFinished("true");
        }
        plan.setRealtime(realtimeMin);
        planDao.updatePlanByPlanId(plan);
    }
}
