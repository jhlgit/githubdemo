package com.jhl.entity.pojo;

import com.jhl.entity.pojo.Productnotes;
import com.jhl.entity.pojo.ProductnotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductnotesMapper {
    long countByExample(ProductnotesExample example);

    int deleteByExample(ProductnotesExample example);

    int deleteByPrimaryKey(Integer noteId);

    int insert(Productnotes record);

    int insertSelective(Productnotes record);

    List<Productnotes> selectByExampleWithBLOBs(ProductnotesExample example);

    List<Productnotes> selectByExample(ProductnotesExample example);

    Productnotes selectByPrimaryKey(Integer noteId);

    int updateByExampleSelective(@Param("record") Productnotes record, @Param("example") ProductnotesExample example);

    int updateByExampleWithBLOBs(@Param("record") Productnotes record, @Param("example") ProductnotesExample example);

    int updateByExample(@Param("record") Productnotes record, @Param("example") ProductnotesExample example);

    int updateByPrimaryKeySelective(Productnotes record);

    int updateByPrimaryKeyWithBLOBs(Productnotes record);

    int updateByPrimaryKey(Productnotes record);
}