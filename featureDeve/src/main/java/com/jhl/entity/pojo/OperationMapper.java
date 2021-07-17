package com.jhl.entity.pojo;

import com.jhl.entity.pojo.Operation;
import com.jhl.entity.pojo.OperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationMapper {
    long countByExample(OperationExample example);

    int deleteByExample(OperationExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(Operation record);

    int insertSelective(Operation record);

    List<Operation> selectByExample(OperationExample example);

    Operation selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") Operation record, @Param("example") OperationExample example);

    int updateByExample(@Param("record") Operation record, @Param("example") OperationExample example);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
}