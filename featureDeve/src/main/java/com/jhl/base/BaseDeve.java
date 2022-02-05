package com.jhl.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseDeve {
    protected static final Log logger = LogFactory.getLog(BaseDeve.class);

    /**
     * @Description 测试AOP切面的继承
     * @Author jhl
     * @Date 2021/11/18 21:58
     * @Version 1.0
     */
    public void test(){
        logger.info("BaseDeve.test");
    }
}
