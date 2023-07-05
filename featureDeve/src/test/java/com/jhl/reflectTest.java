package com.jhl;

import com.jhl.base.LogWriter;
import com.jhl.controller.UserController;
import com.jhl.entity.pojo.Operation;
import com.jhl.practice.JavaSyntaxTests;
import com.jhl.utils.SpringBeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Annotation;
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
@SpringBootTest(classes=FeatureApplication.class)
@RunWith(SpringRunner.class)
public class reflectTest {
    @Autowired
    UserController userController;

    public String testName = "";

    @Test
    public void reflect() {
        System.out.println("reflect");
        LogWriter.info(this.getClass(),"CrashCourseTest.userController:{},{}",userController.getClass().getName(),Integer.toHexString(userController.hashCode()));
        LogWriter.info(this.getClass(),"CrashCourseTest.UserController:{},{}", SpringBeanUtils.getBean("userController").getClass().getName(),Integer.toHexString(SpringBeanUtils.getBean("userController").hashCode()));
        LogWriter.info(this.getClass(),"结束"+SpringBeanUtils.getApplicationContext());
        Class clazz = Operation.class;
        Operation operation = new Operation();
        operation.setLogId(new Long("123"));
        operation.setCreateTime(new Date());
        JavaSyntaxTests javaSyntax = new JavaSyntaxTests();

        Field[] fields = clazz.getDeclaredFields();

        try {
            Method method = clazz.getDeclaredMethod("setCustId", String.class);
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

    @Test
    @RequestMapping()//无用，仅单元测试注解获取
    public void test4AnnotationReflect() {
        Class<reflectTest> clazz = reflectTest.class;
        Annotation[] annotations = clazz.getAnnotations(); //只获取到直接的注解，与getDeclaredAnnotations结果相同。
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        Method[] methods = clazz.getMethods();//获取当前类和父类的public 方法。
        Method[] declaredMethods = clazz.getDeclaredMethods();//只获取到当前类的方法
        Method test4AnnotationReflect = null;
        try {
            test4AnnotationReflect = clazz.getDeclaredMethod("test4AnnotationReflect");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Annotation[] annotations1 = AnnotationUtils.getAnnotations(clazz);
        Annotation[] annotations2 = AnnotationUtils.getAnnotations(test4AnnotationReflect);
        AnnotationAttributes annotationAttributes = AnnotationUtils.getAnnotationAttributes(clazz, annotations[1]);
    }
}
