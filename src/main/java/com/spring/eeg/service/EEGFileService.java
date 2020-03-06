package com.spring.eeg.service;

import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.dao.EegfilelistMapper;
import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EEGFileService {
    @Autowired
    EegfilelistMapper eegfilelistMapper;

    /**
     *
     * @param userId
     * @return
     */
    private List<Eegfilelist> getCurrentFileList(Integer userId) {
        EegfilelistExample eegfilelistExample = new EegfilelistExample();
        EegfilelistExample.Criteria criteria = eegfilelistExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Eegfilelist> eegFileList = eegfilelistMapper.selectByExample(eegfilelistExample);
        return eegFileList;
    }

    public List<Eegfilelist> getCurrentFileList(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return getCurrentFileList(user.getUserid());
    }

}
