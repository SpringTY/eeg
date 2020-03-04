package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Usermassage;
import com.spring.eeg.mbg.model.UsermassageExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsermassageMapper {
    long countByExample(UsermassageExample example);

    int deleteByExample(UsermassageExample example);

    int deleteByPrimaryKey(Integer massageid);

    int insert(Usermassage record);

    int insertSelective(Usermassage record);

    List<Usermassage> selectByExample(UsermassageExample example);

    Usermassage selectByPrimaryKey(Integer massageid);

    int updateByExampleSelective(@Param("record") Usermassage record, @Param("example") UsermassageExample example);

    int updateByExample(@Param("record") Usermassage record, @Param("example") UsermassageExample example);

    int updateByPrimaryKeySelective(Usermassage record);

    int updateByPrimaryKey(Usermassage record);
}