package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.PlanMapper;
import com.spring.eeg.mbg.model.Plan;
import com.spring.eeg.mbg.model.PlanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanDao {
    @Autowired
    PlanMapper planMapper;

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
}
