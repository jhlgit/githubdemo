package com.jhl.practice;

import javafx.concurrent.Task;

import java.util.concurrent.*;

/**
 * @Description 多线程practice
 * @Author jhl
 * @Date 2021/5/10 21:11
 * @Version 1.0
 */
public class RunableAndCallable {
    public static void main(String[] args) {
        RunableAndCallable runableAndCallable=new RunableAndCallable();
        runableAndCallable.callablePractice();
        System.out.println("RunableAndCallable.main end");

    }
    public void callablePractice(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Boolean> future = executorService.submit(new TaskThred());
        int timeout=2;
        try {
            Boolean aBoolean = future.get(timeout, TimeUnit.MILLISECONDS);
            System.out.println("callablePractice:"+aBoolean);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
    static class TaskThred implements Callable<Boolean>{

        @Override
        public Boolean call() throws Exception {
            System.out.println("TaskThred.call");
            return null;
        }
    }
}
