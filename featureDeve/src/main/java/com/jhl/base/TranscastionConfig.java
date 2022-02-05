package com.jhl.base;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Description
 * @Author jhl
 * @Date 2021/11/18 21:44
 * @Version 1.0
 */
@Aspect
public class TranscastionConfig {

    @Pointcut("execution(* com.jhl.base.BaseDeve.test.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        LogWriter.info(this.getClass(), "TranscastionConfig.before()");
    }

}
