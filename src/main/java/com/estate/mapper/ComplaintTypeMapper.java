package com.estate.mapper;

import com.estate.pojo.ComplaintType;
import com.estate.pojo.ComplaintTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintTypeMapper {
    int countByExample(ComplaintTypeExample example);

    int deleteByExample(ComplaintTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplaintType record);

    int insertSelective(ComplaintType record);

    List<ComplaintType> selectByExample(ComplaintTypeExample example);

    ComplaintType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplaintType record, @Param("example") ComplaintTypeExample example);

    int updateByExample(@Param("record") ComplaintType record, @Param("example") ComplaintTypeExample example);

    int updateByPrimaryKeySelective(ComplaintType record);

    int updateByPrimaryKey(ComplaintType record);
}