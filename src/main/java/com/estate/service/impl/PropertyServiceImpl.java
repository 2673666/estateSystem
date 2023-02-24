package com.estate.service.impl;

import com.estate.mapper.PropertyInfoMapper;
import com.estate.pojo.PropertyInfo;
import com.estate.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/12/4 -15:06
 */
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyInfoMapper propertyInfoMapper;


    @Override
    public List<PropertyInfo> findAllPropertyInfo(Integer id, int status) {
//        List<PropertyInfo> propertyInfoList = propertyInfoMapper.findAllPropertyInfo(id,status);
//        for (PropertyInfo p:propertyInfoList) {
//            System.out.println("p = " + p);
//        }
        return propertyInfoMapper.findAllPropertyInfo(id,status);
    }

    @Override
    public int payPropertyMoney(Integer propertyId) {
        return propertyInfoMapper.payPropertyMoney(propertyId);
    }
}
