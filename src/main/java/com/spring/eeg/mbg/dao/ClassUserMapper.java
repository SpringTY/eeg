package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.ClassUser;
import com.spring.eeg.mbg.model.ClassUserExample;
import com.spring.eeg.mbg.model.ClassUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassUserMapper {
    long countByExample(ClassUserExample example);

    int deleteByExample(ClassUserExample example);

    int deleteByPrimaryKey(ClassUserKey key);

    int insert(ClassUser record);

    int insertSelective(ClassUser record);

    List<ClassUser> selectByExample(ClassUserExample example);

    ClassUser selectByPrimaryKey(ClassUserKey key);

    int updateByExampleSelective(@Param("record") ClassUser record, @Param("example") ClassUserExample example);

    int updateByExample(@Param("record") ClassUser record, @Param("example") ClassUserExample example);

    int updateByPrimaryKeySelective(ClassUser record);

    int updateByPrimaryKey(ClassUser record);
}