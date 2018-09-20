package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.Unit;
import org.bdyy.jewelry.pojo.UnitExample;

public interface UnitMapper {
    long countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer unitId);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer unitId);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}