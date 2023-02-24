package com.estate.mapper;

import com.estate.pojo.Parking;
import com.estate.pojo.ParkingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ParkingMapper {
    int countByExample(ParkingExample example);

    int deleteByExample(ParkingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parking record);

    int insertSelective(Parking record);

    List<Parking> selectByExample(ParkingExample example);

    Parking selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parking record, @Param("example") ParkingExample example);

    int updateByExample(@Param("record") Parking record, @Param("example") ParkingExample example);

    int updateByPrimaryKeySelective(Parking record);

    int updateByPrimaryKey(Parking record);
}