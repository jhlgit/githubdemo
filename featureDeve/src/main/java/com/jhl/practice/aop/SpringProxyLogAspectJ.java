package com.jhl.practice.aop;

import com.jhl.base.LogWriter;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Description
 * @Author jhl
 * @Date 2022/1/25 13:17
 * @Version 1.0
 */
@Aspect
public class SpringProxyLogAspectJ {

    @Pointcut("execution(private * com.jhl.practice.aop.AopBase.handle(..))")
    public void handle(){
    }
    @Pointcut("execution(private * com.jhl.practice.aop.SpringProxyLogic.pmethod(..))")
    public void pmethod(){
    }
    @After("handle()")
    public void afterLog(){
        LogWriter.info(this.getClass(),"SpringProxyLogAspectJ.afterLog");
    }
    @Before("pmethod()")
    public void beforeLog(){
        LogWriter.info(this.getClass(),"SpringProxyLogAspectJ.beforeLog");
    }

}
