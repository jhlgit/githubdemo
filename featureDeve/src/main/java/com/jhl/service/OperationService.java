package com.jhl.service;

import com.jhl.entity.podo.Operation;

public interface OperationService {
    int updateByPrimaryKeySelective(Operation record);
    int insert(Operation record);
    int insertSelective(Operation record);

    public int modifyOperation(Operation record) ;

}
