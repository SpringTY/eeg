package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.PlanMapper;
import com.spring.eeg.mbg.dao.PlanstatMapper;
import com.spring.eeg.mbg.dao.PlanstatplusMapper;
import com.spring.eeg.mbg.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanDao {
    @Autowired
    PlanMapper planMapper;

    @Autowired
    PlanstatMapper planstatMapper;
    @Autowired
    PlanstatplusMapper planstatplusMapper;
    public void insert(Plan plan){
        planMapper.insert(plan);
    }

    public List<Plan> getPlans(Integer userId){
        PlanExample planExample = new PlanExample();
        PlanExample.Criteria criteria = planExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return planMapper.selectByExample(planExample);
    }
    public Plan getPlan(Integer planId){
        return planMapper.selectByPrimaryKey(planId);
    }
    public void updatePlanByPlanId(Plan plan){
        planMapper.updateByPrimaryKey(plan);
    }
    public void updateFinished(Integer planId, String finished) {
        Plan plan = new Plan();
        plan.setPlanid(planId);
        plan.setFinished(finished);
        planMapper.updateByPrimaryKeySelective(plan);
    }

    public void updateImportant(Integer planId, String important) {
        Plan plan = new Plan();
        plan.setPlanid(planId);
        plan.setImportant(important);
        planMapper.updateByPrimaryKeySelective(plan);
    }

    public void updateTrash(Integer planId, String trash) {
        Plan plan = new Plan();
        plan.setPlanid(planId);
        plan.setTrash(trash);
        planMapper.updateByPrimaryKeySelective(plan);
    }

    public void deletePlan(Integer planId) {
        planMapper.deleteByPrimaryKey(planId);
    }
    public Planstat getPlanStatistic(Integer userId){
        PlanstatExample planstatExample = new PlanstatExample();
        PlanstatExample.Criteria criteria = planstatExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Planstat> planstats = planstatMapper.selectByExample(planstatExample);
        return (planstats.size() !=0)?planstats.get(0):null;
    }

    public List<Plan> getRecentPlans(Integer userId){

        PlanExample planExample = new PlanExample();
        PlanExample.Criteria criteria = planExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        planExample.setOrderByClause("planDate desc");
        List<Plan> plans = planMapper.selectByExample(planExample);
        if(plans.size()<6){
            return plans;
        }
        return plans.subList(0,6);
    }
    public List<Planstatplus> getRecentPlanStatistics(List<Integer> userIds){
        PlanstatplusExample planstatExample = new PlanstatplusExample();
        PlanstatplusExample.Criteria criteria = planstatExample.createCriteria();
        criteria.andUseridIn(userIds);
        planstatExample.setOrderByClause("finished desc");
        List<Planstatplus> planstats = planstatplusMapper.selectByExample(planstatExample);
        if(planstats.size()<7) return planstats;
        return planstats.subList(0,7);
    }
}
