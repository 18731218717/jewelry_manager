package org.bdyy.jewelry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bdyy.jewelry.pojo.Texture;
import org.bdyy.jewelry.pojo.TextureExample;

public interface TextureMapper {
    long countByExample(TextureExample example);

    int deleteByExample(TextureExample example);

    int deleteByPrimaryKey(Integer textureId);

    int insert(Texture record);

    int insertSelective(Texture record);

    List<Texture> selectByExample(TextureExample example);

    Texture selectByPrimaryKey(Integer textureId);

    int updateByExampleSelective(@Param("record") Texture record, @Param("example") TextureExample example);

    int updateByExample(@Param("record") Texture record, @Param("example") TextureExample example);

    int updateByPrimaryKeySelective(Texture record);

    int updateByPrimaryKey(Texture record);
}