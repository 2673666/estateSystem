package com.estate.mapper;

import com.estate.pojo.Clockin;
import com.estate.pojo.ClockinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClockinMapper {
    int countByExample(ClockinExample example);

    int deleteByExample(ClockinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clockin record);

    int insertSelective(Clockin record);

    List<Clockin> selectByExample(ClockinExample example);

    Clockin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clockin record, @Param("example") ClockinExample example);

    int updateByExample(@Param("record") Clockin record, @Param("example") ClockinExample example);

    int updateByPrimaryKeySelective(Clockin record);

    int updateByPrimaryKey(Clockin record);
}