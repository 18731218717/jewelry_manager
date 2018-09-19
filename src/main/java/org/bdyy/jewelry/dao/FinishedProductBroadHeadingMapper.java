package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductBroadHeading;
import org.bdyy.jewelry.pojo.FinishedProductBroadHeadingExample;

public interface FinishedProductBroadHeadingMapper {
    long countByExample(FinishedProductBroadHeadingExample example);

    int deleteByExample(FinishedProductBroadHeadingExample example);

    int deleteByPrimaryKey(Integer finishedProductBroadHeadingId);

    int insert(FinishedProductBroadHeading record);

    int insertSelective(FinishedProductBroadHeading record);

    List<FinishedProductBroadHeading> selectByExample(FinishedProductBroadHeadingExample example);

    FinishedProductBroadHeading selectByPrimaryKey(Integer finishedProductBroadHeadingId);

    int updateByExampleSelective(@Param("record") FinishedProductBroadHeading record, @Param("example") FinishedProductBroadHeadingExample example);

    int updateByExample(@Param("record") FinishedProductBroadHeading record, @Param("example") FinishedProductBroadHeadingExample example);

    int updateByPrimaryKeySelective(FinishedProductBroadHeading record);

    int updateByPrimaryKey(FinishedProductBroadHeading record);
}