package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.UserlastweekstateMapper;
import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.mbg.model.UserlastweekstateExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserLastWeekStateDao {
    @Autowired
    UserlastweekstateMapper userlastweekstateMapper;
    public Userlastweekstate getUserLastWeekState(Integer userId){
        UserlastweekstateExample userlastweekstateExample = new UserlastweekstateExample();
        UserlastweekstateExample.Criteria criteria = userlastweekstateExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Userlastweekstate> userLastWeekStates = userlastweekstateMapper.selectByExample(userlastweekstateExample);
        Userlastweekstate userlastweekstate = userLastWeekStates.get(0);
        return userlastweekstate;
    }

    public void insert(Userlastweekstate userlastweekstate) {
        userlastweekstateMapper.insert(userlastweekstate);
    }

    /**
     *
     * @param userlastweekstate
     */
    public void updateByUserId(Userlastweekstate userlastweekstate){
        UserlastweekstateExample userlastweekstateExample = new UserlastweekstateExample();
        UserlastweekstateExample.Criteria criteria = userlastweekstateExample.createCriteria();
        criteria.andUseridEqualTo(userlastweekstate.getUserid());
        userlastweekstateMapper.updateByExample(userlastweekstate,userlastweekstateExample);
    }
}
