package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Userlastweekstate;
import com.spring.eeg.mbg.model.UserlastweekstateExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserlastweekstateMapper {
    long countByExample(UserlastweekstateExample example);

    int deleteByExample(UserlastweekstateExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userlastweekstate record);

    int insertSelective(Userlastweekstate record);

    List<Userlastweekstate> selectByExample(UserlastweekstateExample example);

    Userlastweekstate selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userlastweekstate record, @Param("example") UserlastweekstateExample example);

    int updateByExample(@Param("record") Userlastweekstate record, @Param("example") UserlastweekstateExample example);

    int updateByPrimaryKeySelective(Userlastweekstate record);

    int updateByPrimaryKey(Userlastweekstate record);
}