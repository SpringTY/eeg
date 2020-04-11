package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Planstat;
import com.spring.eeg.mbg.model.PlanstatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanstatMapper {
    long countByExample(PlanstatExample example);

    int deleteByExample(PlanstatExample example);

    int insert(Planstat record);

    int insertSelective(Planstat record);

    List<Planstat> selectByExample(PlanstatExample example);

    int updateByExampleSelective(@Param("record") Planstat record, @Param("example") PlanstatExample example);

    int updateByExample(@Param("record") Planstat record, @Param("example") PlanstatExample example);
}