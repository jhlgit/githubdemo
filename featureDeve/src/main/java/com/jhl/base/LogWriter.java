package com.jhl.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author jhl
 * @Date 2021/8/14 10:34
 * @Version 1.0
 */
public class LogWriter {
    /**
     * @Description TODO 打印的日志前缀不是调用方的方法路径
     * @Author jhl
     * @Date 2021/10/5 11:22
     * @Version 1.0
     */
    public static void info (Class clazz,String message){
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.info(message,"","","","");
    }

    public static void info (Class clazz,String message,Object... arguments){
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.info(message,arguments);
    }
}