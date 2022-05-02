package com.jhl.practice;

import com.jhl.base.LogWriter;

/**
 * @Description
 * @Author jhl
 * @Date 2022/5/2 15:19
 * @Version 1.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread t=new Thread(){
                @Override
                public void run(){
                    String name=Thread.currentThread().getName();
                    Holder holder=new Holder(5,name);
                    if(holder.getN() != 5 ){
                        LogWriter.info(ThreadTest.class,"holder.getN() != 5");
                    }
                }
            };
            t.start();
            LogWriter.info(ThreadTest.class,"HThread stoped："+i);
        }

        LogWriter.info(ThreadTest.class,"ThreadTest main stoped");
    }
}
