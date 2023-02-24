package com.estate.mapper;

import com.estate.pojo.PropertyType;
import com.estate.pojo.PropertyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyTypeMapper {
    int countByExample(PropertyTypeExample example);

    int deleteByExample(PropertyTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropertyType record);

    int insertSelective(PropertyType record);

    List<PropertyType> selectByExample(PropertyTypeExample example);

    PropertyType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropertyType record, @Param("example") PropertyTypeExample example);

    int updateByExample(@Param("record") PropertyType record, @Param("example") PropertyTypeExample example);

    int updateByPrimaryKeySelective(PropertyType record);

    int updateByPrimaryKey(PropertyType record);
}