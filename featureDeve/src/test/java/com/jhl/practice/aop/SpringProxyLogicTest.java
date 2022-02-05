package com.jhl.practice.aop;

import com.jhl.base.LogWriter;
import com.jhl.base.RootConfig;
import com.jhl.base.WebAppInitializer;
import com.jhl.base.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description
 * @Author jhl
 * @Date 2022/1/25 13:44
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebAppInitializer.class,RootConfig.class,WebConfig.class})
@WebAppConfiguration
public class SpringProxyLogicTest {
    @Autowired
    SpringProxyLogic springProxyLogic;

    @Test
    public void test4publicMethod(){
        LogWriter.info(this.getClass(),"test4publicMethod开始");
        springProxyLogic.publicMethod();
        LogWriter.info(this.getClass(),"test4publicMethod结束");

    }
}
