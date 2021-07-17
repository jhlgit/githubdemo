package com.jhl.entity.pojo;

import com.jhl.entity.pojo.Productcustomers;
import com.jhl.entity.pojo.ProductcustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcustomersMapper {
    long countByExample(ProductcustomersExample example);

    int deleteByExample(ProductcustomersExample example);

    int insert(Productcustomers record);

    int insertSelective(Productcustomers record);

    List<Productcustomers> selectByExample(ProductcustomersExample example);

    int updateByExampleSelective(@Param("record") Productcustomers record, @Param("example") ProductcustomersExample example);

    int updateByExample(@Param("record") Productcustomers record, @Param("example") ProductcustomersExample example);
}