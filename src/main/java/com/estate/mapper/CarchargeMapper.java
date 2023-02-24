package com.estate.mapper;

import com.estate.pojo.Carcharge;
import com.estate.pojo.CarchargeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CarchargeMapper {
    int countByExample(CarchargeExample example);

    int deleteByExample(CarchargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carcharge record);

    int insertSelective(Carcharge record);

    List<Carcharge> selectByExample(CarchargeExample example);

    Carcharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carcharge record, @Param("example") CarchargeExample example);

    int updateByExample(@Param("record") Carcharge record, @Param("example") CarchargeExample example);

    int updateByPrimaryKeySelective(Carcharge record);

    int updateByPrimaryKey(Carcharge record);

    List<Carcharge> findAllCarPayInfo(@Param("userId") int userId, @Param("status") int status);

    Integer payCarMoney(@Param("payId") int payId);
}