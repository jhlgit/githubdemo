package com.jhl.controller;

import com.jhl.base.LogWriter;
import com.jhl.practice.AsyncLogic;
import com.jhl.practice.CommonRunThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author jhl
 * @Date 2023/2/3 21:37
 * @Version 1.0
 */
@RestController
public class threadPoolExecuteController {

    @Autowired
    AsyncLogic asyncLogic;
    private LinkedBlockingQueue<Runnable> list = new LinkedBlockingQueue<>(10);
    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, list);

    @RequestMapping("/threadPool/temp")
    public void temp() {
        creat();
    }

    @RequestMapping("/threadPool/async")
    public void async() {
        LogWriter.info(this.getClass(),"Controller.async开始,线程名："+Thread.currentThread().getName());
        asyncLogic.asyncMethod();
        LogWriter.info(this.getClass(),"Controller.async结束,线程名："+Thread.currentThread().getName());
    }

    public void creat() {
        System.out.println("creat执行开始");
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        for (int i = 0; i < 5; i++) {
            System.out.println("creat执行循环第:" + i);
            threadPoolExecutor.execute(new CommonRunThread());
        }
        System.out.println("creat执行结束");
    }
}
