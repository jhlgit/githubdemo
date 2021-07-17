package com.jhl.entity.pojo;

import com.jhl.entity.pojo.Orderitems;
import com.jhl.entity.pojo.OrderitemsExample;
import com.jhl.entity.pojo.OrderitemsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemsMapper {
    long countByExample(OrderitemsExample example);

    int deleteByExample(OrderitemsExample example);

    int deleteByPrimaryKey(OrderitemsKey key);

    int insert(Orderitems record);

    int insertSelective(Orderitems record);

    List<Orderitems> selectByExample(OrderitemsExample example);

    Orderitems selectByPrimaryKey(OrderitemsKey key);

    int updateByExampleSelective(@Param("record") Orderitems record, @Param("example") OrderitemsExample example);

    int updateByExample(@Param("record") Orderitems record, @Param("example") OrderitemsExample example);

    int updateByPrimaryKeySelective(Orderitems record);

    int updateByPrimaryKey(Orderitems record);
}