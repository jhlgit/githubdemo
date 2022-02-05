package com.jhl.entity.pojo;

import com.jhl.base.LogWriter;
import com.jhl.base.RootConfig;
import com.jhl.base.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @Description
 * @Author jhl
 * @Date 2021/9/11 9:53
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class,WebConfig.class})
@WebAppConfiguration
public class CustomersMapperTest {

    @Autowired
    CustomersMapper customersMapper;
    @Test
    public void  test4selectByExample(){
        CustomersExample example =new CustomersExample();
        example.createCriteria().andCustAgeBetween(10,99);
        List<Customers> customers = customersMapper.selectByExample(example);
        LogWriter.info(this.getClass(),customers.toString());
    }
}
