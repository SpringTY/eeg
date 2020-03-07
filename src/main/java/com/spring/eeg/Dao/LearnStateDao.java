package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.LearnstateMapper;
import com.spring.eeg.mbg.model.Learnstate;
import com.spring.eeg.mbg.model.LearnstateExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class LearnStateDao {
    @Autowired
    LearnstateMapper learnstateMapper;
    public List<Learnstate> getLearnStateBetweenDate(Integer UserId, Date start, Date end){
        LearnstateExample learnstateExample = new LearnstateExample();
        LearnstateExample.Criteria criteria = learnstateExample.createCriteria();
        criteria.andLearndateGreaterThanOrEqualTo(start);
        criteria.andLearndateLessThanOrEqualTo(end);
        criteria.andUseridEqualTo(UserId);
        List<Learnstate> learnStates = learnstateMapper.selectByExample(learnstateExample);
        return learnStates;
    }
}
