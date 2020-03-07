package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Learnstate;
import com.spring.eeg.mbg.model.LearnstateExample;
import com.spring.eeg.mbg.model.LearnstateKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnstateMapper {
    long countByExample(LearnstateExample example);

    int deleteByExample(LearnstateExample example);

    int deleteByPrimaryKey(LearnstateKey key);

    int insert(Learnstate record);

    int insertSelective(Learnstate record);

    List<Learnstate> selectByExample(LearnstateExample example);

    Learnstate selectByPrimaryKey(LearnstateKey key);

    int updateByExampleSelective(@Param("record") Learnstate record, @Param("example") LearnstateExample example);

    int updateByExample(@Param("record") Learnstate record, @Param("example") LearnstateExample example);

    int updateByPrimaryKeySelective(Learnstate record);

    int updateByPrimaryKey(Learnstate record);
}