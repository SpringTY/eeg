package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Lastweekview;
import com.spring.eeg.mbg.model.LastweekviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LastweekviewMapper {
    long countByExample(LastweekviewExample example);

    int deleteByExample(LastweekviewExample example);

    int insert(Lastweekview record);

    int insertSelective(Lastweekview record);

    List<Lastweekview> selectByExample(LastweekviewExample example);

    int updateByExampleSelective(@Param("record") Lastweekview record, @Param("example") LastweekviewExample example);

    int updateByExample(@Param("record") Lastweekview record, @Param("example") LastweekviewExample example);
}