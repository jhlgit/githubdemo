package com.jhl.practice.aop;

import com.jhl.base.LogWriter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description
 * @Author jhl
 * @Date 2022/1/25 13:15
 * @Version 1.0
 */
@Component("springProxyLogic2")
public class SpringProxyLogic implements AopBase {
    @Resource(name = "springProxyLogic2")
    SpringProxyLogic springProxyLogic;
    @Override
    public Object handle(Object object) {
        LogWriter.info(this.getClass(),"SpringProxyLogic开始");
        return null;
    }

    /**
     * @Description 被pointcut的私有方法
     * @Author jhl
     * @Date 2022/1/25 13:45
     * @Version 1.0
     */
    private void pmethod(){
        LogWriter.info(this.getClass(),"pmethod开始");
    }

    /**
     * @Description 为单测私方法写的public 调用方法
     * @Author jhl
     * @Date 2022/1/25 13:45
     * @Version 1.0
     */
    public void publicMethod(){
        LogWriter.info(this.getClass(),"publicMethod开始");
        springProxyLogic.pmethod();
        LogWriter.info(this.getClass(),"publicMethod结束");
    }
}
