package com.estate.service.impl;

import com.estate.mapper.CarchargeMapper;
import com.estate.pojo.Carcharge;
import com.estate.pojo.CarchargeExample;
import com.estate.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/12/3 -14:08
 */
@Service  // 实现层的注解
public class CarServiceImpl implements CarService {
    @Autowired
    private CarchargeMapper carchargeMapper;

    @Override
    public List<Carcharge> findAllCarInfo(Integer id,Integer status) {
//        CarchargeExample example = new CarchargeExample();
//        CarchargeExample.Criteria criteria = example.createCriteria();
//        criteria.andOwnerIdEqualTo(id);

//        List<Carcharge> carChargeList = carchargeMapper.selectByExample(example);
//        return carChargeList;
        List<Carcharge> allCarPayInfo = carchargeMapper.findAllCarPayInfo(id, status);

        return allCarPayInfo;

    }

    @Override
    public int payCarMoney(int payId) {
        return carchargeMapper.payCarMoney(payId);
    }
}
