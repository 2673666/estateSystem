package com.estate.service;

import com.estate.pojo.Carcharge;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/12/3 -14:08
 */

public interface CarService {
    List<Carcharge> findAllCarInfo(Integer id,Integer status);

    int payCarMoney(int payId);
}
