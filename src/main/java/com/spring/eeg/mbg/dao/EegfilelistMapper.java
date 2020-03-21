package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Eegfilelist;
import com.spring.eeg.mbg.model.EegfilelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EegfilelistMapper {
    long countByExample(EegfilelistExample example);

    int deleteByExample(EegfilelistExample example);

    int deleteByPrimaryKey(Integer fileid);

    int insert(Eegfilelist record);

    int insertSelective(Eegfilelist record);

    List<Eegfilelist> selectByExample(EegfilelistExample example);

    Eegfilelist selectByPrimaryKey(Integer fileid);

    int updateByExampleSelective(@Param("record") Eegfilelist record, @Param("example") EegfilelistExample example);

    int updateByExample(@Param("record") Eegfilelist record, @Param("example") EegfilelistExample example);

    int updateByPrimaryKeySelective(Eegfilelist record);

    int updateByPrimaryKey(Eegfilelist record);
}