package com.jhl.practice;

/**
 * @Description
 * @Author jhl
 * @Date 2023/2/3 22:01
 * @Version 1.0
 */
public class CommonRunThread implements Runnable {


    @Override
    public void run() {
        String preMsg="CommonRunThread,当前线程id："+Thread.currentThread().getId()+","+Thread.currentThread()
                .getName();
        System.out.println(preMsg+",start");
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(100*1000);
                System.out.println(preMsg+",循环第:"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(preMsg+",end");
    }
}
