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
        LogWriter.info(this.getClass(),"SpringProxyLogic.handle开始");
        return null;
    }

    /**
     * @Description 私有方法切点不会生效：@Pointcut("execution(private * com.jhl.practice.aop.SpringProxyLogic.privateMethod(..))")
     * @Author jhl
     * @Date 2022/1/25 13:45
     * @Version 1.0
     */
    private void privateMethod(){
        LogWriter.info(this.getClass(),"privateMethod开始");
    }

    /**
     * @Description 为单测私方法写的public 调用方法
     * @Author jhl
     * @Date 2022/1/25 13:45
     * @Version 1.0
     */
    public void publicMethod(){
        LogWriter.info(this.getClass(),"publicMethod开始");
        springProxyLogic.privateMethod();
        LogWriter.info(this.getClass(),"publicMethod结束");
    }
}
