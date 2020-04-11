package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Planstatplus;
import com.spring.eeg.mbg.model.PlanstatplusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanstatplusMapper {
    long countByExample(PlanstatplusExample example);

    int deleteByExample(PlanstatplusExample example);

    int insert(Planstatplus record);

    int insertSelective(Planstatplus record);

    List<Planstatplus> selectByExample(PlanstatplusExample example);

    int updateByExampleSelective(@Param("record") Planstatplus record, @Param("example") PlanstatplusExample example);

    int updateByExample(@Param("record") Planstatplus record, @Param("example") PlanstatplusExample example);
}