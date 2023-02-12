package com.jhl.practice;

import com.jhl.base.LogWriter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author jhl
 * @Date 2023/2/12 14:31
 * @Version 1.0
 */
@Component
public class AsyncLogic {

    @Async
    public void asyncMethod(){
        LogWriter.info(this.getClass(),"asyncMethod,线程名："+Thread.currentThread().getName());
    }
}
