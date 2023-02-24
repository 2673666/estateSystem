package com.estate.mapper;

import com.estate.pojo.Repairtype;
import com.estate.pojo.RepairtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairtypeMapper {
    int countByExample(RepairtypeExample example);

    int deleteByExample(RepairtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Repairtype record);

    int insertSelective(Repairtype record);

    List<Repairtype> selectByExample(RepairtypeExample example);

    Repairtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Repairtype record, @Param("example") RepairtypeExample example);

    int updateByExample(@Param("record") Repairtype record, @Param("example") RepairtypeExample example);

    int updateByPrimaryKeySelective(Repairtype record);

    int updateByPrimaryKey(Repairtype record);
}