package com.estate.service;


import com.estate.pojo.PropertyInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/12/4 -15:06
 */
public interface PropertyService {

    List<PropertyInfo> findAllPropertyInfo(Integer id, int status);

    int payPropertyMoney(@Param("propertyId") Integer propertyId);
}
