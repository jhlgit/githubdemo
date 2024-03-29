package com.jhl.entity.pojo;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductsMapper {
    long countByExample(ProductsExample example);

    int deleteByExample(ProductsExample example);

    int deleteByPrimaryKey(String prodId);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExampleWithBLOBs(ProductsExample example);

    List<Products> selectByExample(ProductsExample example);

    Products selectByPrimaryKey(String prodId);

    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExampleWithBLOBs(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKeyWithBLOBs(Products record);

    int updateByPrimaryKey(Products record);
}