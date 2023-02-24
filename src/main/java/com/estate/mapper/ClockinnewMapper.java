package com.estate.mapper;

import com.estate.pojo.Clockinnew;
import com.estate.pojo.ClockinnewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClockinnewMapper {
    int countByExample(ClockinnewExample example);

    int deleteByExample(ClockinnewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clockinnew record);

    int insertSelective(Clockinnew record);

    List<Clockinnew> selectByExample(ClockinnewExample example);

    Clockinnew selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clockinnew record, @Param("example") ClockinnewExample example);

    int updateByExample(@Param("record") Clockinnew record, @Param("example") ClockinnewExample example);

    int updateByPrimaryKeySelective(Clockinnew record);

    int updateByPrimaryKey(Clockinnew record);
}