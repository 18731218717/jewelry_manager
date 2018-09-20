package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductDiscern;
import org.bdyy.jewelry.pojo.FinishedProductDiscernExample;

public interface FinishedProductDiscernMapper {
    long countByExample(FinishedProductDiscernExample example);

    int deleteByExample(FinishedProductDiscernExample example);

    int deleteByPrimaryKey(Integer finishedProductDiscernId);

    int insert(FinishedProductDiscern record);

    int insertSelective(FinishedProductDiscern record);

    List<FinishedProductDiscern> selectByExample(FinishedProductDiscernExample example);

    FinishedProductDiscern selectByPrimaryKey(Integer finishedProductDiscernId);

    int updateByExampleSelective(@Param("record") FinishedProductDiscern record, @Param("example") FinishedProductDiscernExample example);

    int updateByExample(@Param("record") FinishedProductDiscern record, @Param("example") FinishedProductDiscernExample example);

    int updateByPrimaryKeySelective(FinishedProductDiscern record);

    int updateByPrimaryKey(FinishedProductDiscern record);
}