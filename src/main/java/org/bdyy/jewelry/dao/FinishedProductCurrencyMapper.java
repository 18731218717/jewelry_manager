package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductCurrency;
import org.bdyy.jewelry.pojo.FinishedProductCurrencyExample;

public interface FinishedProductCurrencyMapper {
    long countByExample(FinishedProductCurrencyExample example);

    int deleteByExample(FinishedProductCurrencyExample example);

    int deleteByPrimaryKey(Integer finishedProductCurrencyId);

    int insert(FinishedProductCurrency record);

    int insertSelective(FinishedProductCurrency record);

    List<FinishedProductCurrency> selectByExample(FinishedProductCurrencyExample example);

    FinishedProductCurrency selectByPrimaryKey(Integer finishedProductCurrencyId);

    int updateByExampleSelective(@Param("record") FinishedProductCurrency record, @Param("example") FinishedProductCurrencyExample example);

    int updateByExample(@Param("record") FinishedProductCurrency record, @Param("example") FinishedProductCurrencyExample example);

    int updateByPrimaryKeySelective(FinishedProductCurrency record);

    int updateByPrimaryKey(FinishedProductCurrency record);
}