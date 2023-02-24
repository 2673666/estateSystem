package com.estate.mapper;

import com.estate.pojo.PropertyInfo;
import com.estate.pojo.PropertyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyInfoMapper {
    int countByExample(PropertyInfoExample example);

    int deleteByExample(PropertyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropertyInfo record);

    int insertSelective(PropertyInfo record);

    List<PropertyInfo> selectByExample(PropertyInfoExample example);

    PropertyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropertyInfo record, @Param("example") PropertyInfoExample example);

    int updateByExample(@Param("record") PropertyInfo record, @Param("example") PropertyInfoExample example);

    int updateByPrimaryKeySelective(PropertyInfo record);

    int updateByPrimaryKey(PropertyInfo record);

    List<PropertyInfo> findAllPropertyInfo(@Param("userId") int userId,@Param("status") int status);

    int payPropertyMoney(Integer propertyId);
}