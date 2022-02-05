package com.jhl.entity.pojo;

import com.jhl.entity.pojo.Customers;
import com.jhl.entity.pojo.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    long countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int deleteByPrimaryKey(Integer custId);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExample(CustomersExample example);

    Customers selectByPrimaryKey(Integer custId);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKey(Customers record);
}