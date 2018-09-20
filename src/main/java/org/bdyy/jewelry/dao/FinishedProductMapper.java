package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProduct;
import org.bdyy.jewelry.pojo.FinishedProductExample;

public interface FinishedProductMapper {
    long countByExample(FinishedProductExample example);

    int deleteByExample(FinishedProductExample example);

    int deleteByPrimaryKey(Integer finishedProductId);

    int insert(FinishedProduct record);

    int insertSelective(FinishedProduct record);

    List<FinishedProduct> selectByExample(FinishedProductExample example);

    FinishedProduct selectByPrimaryKey(Integer finishedProductId);

    int updateByExampleSelective(@Param("record") FinishedProduct record, @Param("example") FinishedProductExample example);

    int updateByExample(@Param("record") FinishedProduct record, @Param("example") FinishedProductExample example);

    int updateByPrimaryKeySelective(FinishedProduct record);

    int updateByPrimaryKey(FinishedProduct record);
}