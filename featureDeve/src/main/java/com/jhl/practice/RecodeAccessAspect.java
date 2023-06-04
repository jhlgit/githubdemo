package com.jhl.practice;

import com.jhl.base.LogWriter;
import org.apache.tomcat.jni.Mmap;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RecodeAccessAspect {

    /**
     * execution(<修饰符><返回类型><包.类.方法(参数)><异常>)
     * 修饰符和异常可以省略。
     **/


    @Pointcut("execution (* com.jhl..*.*(..))")
    public void methodPoint() {

    }
    @Pointcut("@annotation(com.jhl.practice.RecodeAccess)")
    public void annotaionPoint(){

    }

    @Before("methodPoint()")
    public void process1(JoinPoint point){
        String classname=point.getTarget().getClass().getSimpleName();
        String methodname = point.getSignature().getName();
        LogWriter.info(this.getClass(),"方法切面，执行方法前打印日志");
        LogWriter.info(this.getClass(),"方法切面，类名：{},方法名:{}",classname,methodname);
    }

    @Around("annotaionPoint()")
    public void process(ProceedingJoinPoint point){
        LogWriter.info(this.getClass(),"注解切面，执行方法前打印日志");
        try {
            point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        LogWriter.info(this.getClass(),"注解切面，执行方法后打印日志");
    }
}
