package com.jhl.utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtils {
    private static final  LinkedBlockingQueue<Runnable> list = new LinkedBlockingQueue<>(10);
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, list);

    public static ThreadPoolExecutor gethreadPool(){
    return threadPoolExecutor;
    }
}
