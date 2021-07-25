package com.jhl.entity.pojo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VendorsMapper {
    long countByExample(VendorsExample example);

    int deleteByExample(VendorsExample example);

    int deleteByPrimaryKey(Integer vendId);

    int insert(Vendors record);

    int insertSelective(Vendors record);

    List<Vendors> selectByExample(VendorsExample example);

    Vendors selectByPrimaryKey(Integer vendId);

    int updateByExampleSelective(@Param("record") Vendors record, @Param("example") VendorsExample example);

    int updateByExample(@Param("record") Vendors record, @Param("example") VendorsExample example);

    int updateByPrimaryKeySelective(Vendors record);

    int updateByPrimaryKey(Vendors record);
}