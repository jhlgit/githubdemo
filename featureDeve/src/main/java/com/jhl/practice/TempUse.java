package com.jhl.practice;


import com.alibaba.fastjson.JSON;
import com.jhl.base.LogWriter;
import com.jhl.base.RootConfig;
import com.jhl.common.base.TestConfig;
import com.jhl.utils.SpringBeanUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TempUse {

    @Autowired
    TestConfig testConfig;
    @Autowired
    RootConfig rootConfig;
    public void test(){
        LogWriter.info(this.getClass(),"TestConfig:{}", JSON.toJSON(testConfig));
        LogWriter.info(this.getClass(),"RootConfig:{}", JSON.toJSON(rootConfig));
        ComboPooledDataSource bean = SpringBeanUtils.getBean(ComboPooledDataSource.class);
        LogWriter.info(this.getClass(),"ComboPooledDataSource:{}", JSON.toJSON(bean.getUser()));
    }
}
