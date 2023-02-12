package com.jhl.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author jhl
 * @Date 2023/2/12 15:39
 * @Version 1.0
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    public static void setContext(ApplicationContext applicationContext) {
        SpringBeanUtils.context = applicationContext;
    }

//通过name获取 Bean.

    public static Object getBean(String name) {
        return context.getBean(name);
    }

//通过class获取Bean.

    public static <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }

//通过name,以及Clazz返回指定的Bean

    public static <T> T getBean(String name, Class<T> clazz) {
        return context.getBean(name, clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }
}
