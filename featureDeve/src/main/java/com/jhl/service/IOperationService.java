package com.jhl.service;

import com.jhl.entity.pojo.Operation;

public interface IOperationService {
    int updateByPrimaryKeySelective(Operation record);
    int insert(Operation record);
    int insertSelective(Operation record);

    public int modifyOperation(Operation record) ;

}
