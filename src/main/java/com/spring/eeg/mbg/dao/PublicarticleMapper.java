package com.spring.eeg.mbg.dao;

import com.spring.eeg.mbg.model.Publicarticle;
import com.spring.eeg.mbg.model.PublicarticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicarticleMapper {
    long countByExample(PublicarticleExample example);

    int deleteByExample(PublicarticleExample example);

    int insert(Publicarticle record);

    int insertSelective(Publicarticle record);

    List<Publicarticle> selectByExample(PublicarticleExample example);

    int updateByExampleSelective(@Param("record") Publicarticle record, @Param("example") PublicarticleExample example);

    int updateByExample(@Param("record") Publicarticle record, @Param("example") PublicarticleExample example);
}