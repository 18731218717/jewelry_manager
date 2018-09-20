package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.FinishedProductTexture;
import org.bdyy.jewelry.pojo.FinishedProductTextureExample;

public interface FinishedProductTextureMapper {
    long countByExample(FinishedProductTextureExample example);

    int deleteByExample(FinishedProductTextureExample example);

    int deleteByPrimaryKey(Integer finishedProductTextureId);

    int insert(FinishedProductTexture record);

    int insertSelective(FinishedProductTexture record);

    List<FinishedProductTexture> selectByExample(FinishedProductTextureExample example);

    FinishedProductTexture selectByPrimaryKey(Integer finishedProductTextureId);

    int updateByExampleSelective(@Param("record") FinishedProductTexture record, @Param("example") FinishedProductTextureExample example);

    int updateByExample(@Param("record") FinishedProductTexture record, @Param("example") FinishedProductTextureExample example);

    int updateByPrimaryKeySelective(FinishedProductTexture record);

    int updateByPrimaryKey(FinishedProductTexture record);
}