package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductSubclass;
import org.bdyy.jewelry.pojo.FinishedProductSubclassExample;

public interface FinishedProductSubclassMapper {
    long countByExample(FinishedProductSubclassExample example);

    int deleteByExample(FinishedProductSubclassExample example);

    int deleteByPrimaryKey(Integer finishedProductSubclassId);

    int insert(FinishedProductSubclass record);

    int insertSelective(FinishedProductSubclass record);

    List<FinishedProductSubclass> selectByExample(FinishedProductSubclassExample example);

    FinishedProductSubclass selectByPrimaryKey(Integer finishedProductSubclassId);

    int updateByExampleSelective(@Param("record") FinishedProductSubclass record, @Param("example") FinishedProductSubclassExample example);

    int updateByExample(@Param("record") FinishedProductSubclass record, @Param("example") FinishedProductSubclassExample example);

    int updateByPrimaryKeySelective(FinishedProductSubclass record);

    int updateByPrimaryKey(FinishedProductSubclass record);
}