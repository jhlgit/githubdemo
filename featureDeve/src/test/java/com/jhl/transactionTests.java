package com.jhl;

import com.jhl.base.BaseJunit4Test;
import com.jhl.entity.podo.Operation;
import com.jhl.entity.podo.OperationMapper;
import com.jhl.service.IOperationService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@WebAppConfiguration
public class transactionTests extends BaseJunit4Test {
    private static final Logger logger = Logger.getLogger(transactionTests.class);
    @Resource
    private OperationMapper operationMapper;
    @Resource
    private IOperationService operationService;

    @Test
    @Rollback(false)
    public void  updateOpr(){
        Date date = new Date();
        Operation operation=new Operation();
        operation.setCustId(10001);
        double random =  Math.random();
        long nextLong;
        nextLong = new Random().nextLong();
        operation.setContent("first"+nextLong);
        operation.setCreateTime(date);
        operation.setUpdateTime(date);
//        inset(operation);
        operation.setLogId((double)1);
        operationService.modifyOperation(operation);
        String oprlog = "updateOprlog:";
        logger.info(operation.getLogId()+ oprlog +nextLong);

        operation.setLogId((double)2);
        nextLong = new Random().nextLong();
        operation.setContent("first"+nextLong);
        try {
            operationService.modifyOperation(operation);
        } catch (Exception e) {
            logger.info(e.getMessage(),e);
        }
        logger.info(operation.getLogId()+ oprlog +nextLong);
    }

    private void inset(Operation operation) {
        int insert = operationMapper.insert(operation);
    }

    public static void main(String[] args) {
        ArrayList<Operation> list = new ArrayList<Operation>();
        list=null;
        for (Operation operation : list) {
            System.out.println(operation);
        }
    }
}
