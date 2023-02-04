package com.jhl.controller;

import com.jhl.ProducerAndConsumer.queue.CommonRunThread;
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

    private LinkedBlockingQueue<Runnable> list = new LinkedBlockingQueue<>(10);
    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, list);
    @RequestMapping("/threadPool/temp")
    public void temp() {
        creat();
    }

    public void creat() {
        System.out.println("creat执行开始");
        for (int i = 0; i < 5; i++) {
            System.out.println("creat执行循环第:" + i);
            threadPoolExecutor.execute(new CommonRunThread());
        }
        System.out.println("creat执行结束");
    }
}
