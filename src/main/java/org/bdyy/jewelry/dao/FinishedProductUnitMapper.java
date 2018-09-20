package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductUnit;
import org.bdyy.jewelry.pojo.FinishedProductUnitExample;

public interface FinishedProductUnitMapper {
    long countByExample(FinishedProductUnitExample example);

    int deleteByExample(FinishedProductUnitExample example);

    int deleteByPrimaryKey(Integer finishedProductUnitId);

    int insert(FinishedProductUnit record);

    int insertSelective(FinishedProductUnit record);

    List<FinishedProductUnit> selectByExample(FinishedProductUnitExample example);

    FinishedProductUnit selectByPrimaryKey(Integer finishedProductUnitId);

    int updateByExampleSelective(@Param("record") FinishedProductUnit record, @Param("example") FinishedProductUnitExample example);

    int updateByExample(@Param("record") FinishedProductUnit record, @Param("example") FinishedProductUnitExample example);

    int updateByPrimaryKeySelective(FinishedProductUnit record);

    int updateByPrimaryKey(FinishedProductUnit record);
}