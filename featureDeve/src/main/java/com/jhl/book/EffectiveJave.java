package com.jhl.book;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author jhl
 * @Date 2021/4/28 10:52
 * @Version 1.0
 */
public class EffectiveJave {



/*
        private static  boolean stopRequested;
        public static void main(String[] args) throws InterruptedException {
            //stopRequested 两个线程间实时同步
            Thread backgroundThread = new Thread(new Runnable() {
                public void run() {
                    int i = 0;
                    while (!stopRequested){
                        i++;
                        System.out.println(Thread.currentThread().getName()+stopRequested+":"+i);
                    }
                    System.out.println(Thread.currentThread().getName()+"stop."+stopRequested);
                }
            });
            backgroundThread.start();

            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"before:"+stopRequested);
            stopRequested = true;
            System.out.println(Thread.currentThread().getName()+"after:"+stopRequested);
        }
*/

public void practice(){
    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
}
}
