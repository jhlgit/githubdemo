package com.jhl.service.impl;

import com.jhl.base.BaseDeve;
import com.jhl.entity.podo.Operation;
import com.jhl.entity.podo.OperationMapper;
import com.jhl.service.IOperationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

@Service
public class OperationServiceImpl extends BaseDeve implements IOperationService {
    @Resource(type = OperationMapper.class)
    private OperationMapper operationMapper;

    @Override
    public int updateByPrimaryKeySelective(Operation record) {
        int i = operationMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int insert(Operation record) {
        int insert = operationMapper.insert(record);
        return insert;
    }

    @Override
    public int insertSelective(Operation record) {
        int insertSelective = operationMapper.insertSelective(record);
        return insertSelective;
    }

    public int modifyOperation(Operation record) {
        int i = updateByPrimaryKeySelective(record);
        try {
            innerInsert();
            long a=2/(Math.abs(record.getLogId().longValue())%2);
            innerUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    private void innerUpdate() {
        Operation operation=new Operation();
        operation.setLogId((double)3);
        double random =  Math.random();
        long nextLong;
        nextLong = new Random().nextLong();
        operation.setContent("first"+nextLong);
        operationMapper.updateByPrimaryKeySelective(operation);
        logger.info(operation.getLogId()+"innerUpdatelog:"+nextLong);
    }
    private void innerInsert() {
        Date date = new Date();
        Operation operation=new Operation();
        operation.setCustId(10001);
        operation.setCreateTime(date);
        operation.setUpdateTime(date);
        double random =  Math.random();
        long nextLong;
        nextLong = new Random().nextLong();
        operation.setContent("first"+nextLong);
        operationMapper.insertSelective(operation);
        logger.info(operation.getLogId()+"innerInsertlog:"+nextLong);
    }

}
