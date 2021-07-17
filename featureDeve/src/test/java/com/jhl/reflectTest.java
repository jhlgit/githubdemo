package com.jhl;

import com.jhl.controller.JavaSyntax;
import com.jhl.entity.pojo.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @Description
 * @date
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@WebAppConfiguration
//@ContextConfiguration(class = Springconfig)
public class reflectTest {
    @Test
    public void reflect() {
        System.out.println("reflect");
        Class clazz = Operation.class;
        Operation operation = new Operation();
        operation.setLogId(new Long("123"));
        operation.setCreateTime(new Date());
        JavaSyntax javaSyntax = new JavaSyntax();

        Field[] fields = clazz.getDeclaredFields();

        try {
            Method method = clazz.getDeclaredMethod("pricustId", String.class);
            method.setAccessible(true);
            String invoke = (String) method.invoke(operation, "jhl");
            System.out.println(invoke);
            Method method2 = clazz.getMethod("tempFunction");
            String invoke2 = (String) method2.invoke(operation);
            System.out.println("invoke2:" + invoke2);

            Method method3 = clazz.getSuperclass().getMethod("tempFunction");
//            method3.setAccessible(true);
            String invoke3 = (String) method3.invoke(javaSyntax);
            System.out.println("invoke3:" + invoke3);

            Method method4 = clazz.getSuperclass().getDeclaredMethod("tempFunction2", String.class);
            method4.setAccessible(true);
            String invoke4 = (String) method4.invoke(operation, "jhl");
            System.out.println("invoke4:" + invoke4);

            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getType() == Class.forName("java.lang.String")) {
                    field.set(operation, field.getName());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
