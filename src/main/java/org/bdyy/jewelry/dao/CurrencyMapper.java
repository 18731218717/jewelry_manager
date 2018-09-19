package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.Currency;
import org.bdyy.jewelry.pojo.CurrencyExample;

public interface CurrencyMapper {
    long countByExample(CurrencyExample example);

    int deleteByExample(CurrencyExample example);

    int deleteByPrimaryKey(Integer currencyId);

    int insert(Currency record);

    int insertSelective(Currency record);

    List<Currency> selectByExample(CurrencyExample example);

    Currency selectByPrimaryKey(Integer currencyId);

    int updateByExampleSelective(@Param("record") Currency record, @Param("example") CurrencyExample example);

    int updateByExample(@Param("record") Currency record, @Param("example") CurrencyExample example);

    int updateByPrimaryKeySelective(Currency record);

    int updateByPrimaryKey(Currency record);
}