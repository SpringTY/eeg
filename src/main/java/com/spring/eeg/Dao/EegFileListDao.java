package com.spring.eeg.Dao;

import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EegFileListDao {
    @Autowired
    EegfilelistMapper eegfilelistMapper;
    public List<Eegfilelist> getEEGFileList(Integer userId){
        EegfilelistExample eegfilelistExample = new EegfilelistExample();
        EegfilelistExample.Criteria criteria = eegfilelistExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return eegfilelistMapper.selectByExample(eegfilelistExample);
    }
}
