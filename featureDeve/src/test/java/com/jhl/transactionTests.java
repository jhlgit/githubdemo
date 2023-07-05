package com.jhl;

import com.jhl.base.BaseJunit4Test;
import com.jhl.base.LogWriter;
import com.jhl.controller.UserController;
import com.jhl.entity.pojo.Operation;
import com.jhl.entity.pojo.OperationMapper;
import com.jhl.service.IOperationService;
import com.jhl.utils.SpringBeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@SpringBootTest(classes=FeatureApplication.class)
@RunWith(SpringRunner.class)
public class transactionTests extends BaseJunit4Test {
    @Resource
    private OperationMapper operationMapper;
    @Autowired
    private IOperationService operationService;
    @MockBean(reset= MockReset.NONE)
    UserController userController;
    @Test
    @Rollback(false)
    public void updateOpr() {
        LogWriter.info(this.getClass(),"CrashCourseTest.userController:{},{}",userController.getClass().getName(),Integer.toHexString(userController.hashCode()));
        LogWriter.info(this.getClass(),"CrashCourseTest.UserController:{},{}", SpringBeanUtils.getBean("userController").getClass().getName(),Integer.toHexString(SpringBeanUtils.getBean("userController").hashCode()));
        LogWriter.info(this.getClass(),"结束"+SpringBeanUtils.getApplicationContext());
        Date date = new Date();
        Operation operation = new Operation();
        operation.setCustId(10001);
        double random = Math.random();
        long nextLong;
        nextLong = new Random().nextLong();
        operation.setContent("first" + nextLong);
        operation.setCreateTime(date);
        operation.setUpdateTime(date);
//        inset(operation);
        operation.setLogId(1L);
        operationService.modifyOperation(operation);
        String oprlog = "updateOprlog:";
        LogWriter.info(this.getClass(),operation.getLogId() + oprlog + nextLong);

        operation.setLogId(2L);
        nextLong = new Random().nextLong();
        operation.setContent("first" + nextLong);
        try {
            operationService.modifyOperation(operation);
        } catch (Exception e) {
            LogWriter.error(this.getClass(),e.getMessage(), e);
        }
        LogWriter.info(this.getClass(),operation.getLogId() + oprlog + nextLong);
    }

    private void inset(Operation operation) {
        int insert = operationMapper.insert(operation);
    }

    public static void main(String[] args) {
        ArrayList<Operation> list = new ArrayList<Operation>();
        list = null;
        for (Operation operation : list) {
            System.out.println(operation);
        }
    }
}
