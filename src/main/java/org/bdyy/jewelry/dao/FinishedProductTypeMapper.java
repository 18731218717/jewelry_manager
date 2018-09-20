package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductType;
import org.bdyy.jewelry.pojo.FinishedProductTypeExample;

public interface FinishedProductTypeMapper {
    long countByExample(FinishedProductTypeExample example);

    int deleteByExample(FinishedProductTypeExample example);

    int deleteByPrimaryKey(Integer finishedProductTypeId);

    int insert(FinishedProductType record);

    int insertSelective(FinishedProductType record);

    List<FinishedProductType> selectByExample(FinishedProductTypeExample example);

    FinishedProductType selectByPrimaryKey(Integer finishedProductTypeId);

    int updateByExampleSelective(@Param("record") FinishedProductType record, @Param("example") FinishedProductTypeExample example);

    int updateByExample(@Param("record") FinishedProductType record, @Param("example") FinishedProductTypeExample example);

    int updateByPrimaryKeySelective(FinishedProductType record);

    int updateByPrimaryKey(FinishedProductType record);
}