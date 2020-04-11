package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.ClassTable;
import com.spring.eeg.mbg.model.ClassTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTableMapper {
    long countByExample(ClassTableExample example);

    int deleteByExample(ClassTableExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ClassTable record);

    int insertSelective(ClassTable record);

    List<ClassTable> selectByExample(ClassTableExample example);

    ClassTable selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ClassTable record, @Param("example") ClassTableExample example);

    int updateByExample(@Param("record") ClassTable record, @Param("example") ClassTableExample example);

    int updateByPrimaryKeySelective(ClassTable record);

    int updateByPrimaryKey(ClassTable record);
}