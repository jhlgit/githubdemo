package com.jhl.service;

import com.jhl.FeatureApplication;
import com.jhl.base.LogWriter;
import com.jhl.controller.UserController;
import com.jhl.utils.SpringBeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description 调用方法
 * @Author jhl
 * @Date 2020/12/28 19:44
 * @Version 1.0
 */
@SpringBootTest(classes=FeatureApplication.class)
@RunWith(SpringRunner.class)
public class CrashCourseTest {
    @Autowired
    CrashCourse crashCourse;
//    @MockBean(reset= MockReset.NONE)
            @Autowired
    UserController userController;
    @Test
    public void test4genertatisonData() {
        try {
            crashCourse.noTxGenertatisonData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogWriter.info(this.getClass(),"CrashCourseTest.userController:{},{}",userController.getClass().getName(),Integer.toHexString(userController.hashCode()));
        LogWriter.info(this.getClass(),"CrashCourseTest.UserController:{},{}", SpringBeanUtils.getBean("userController").getClass().getName(),Integer.toHexString(SpringBeanUtils.getBean("userController").hashCode()));
        LogWriter.info(this.getClass(),"结束"+SpringBeanUtils.getApplicationContext());
    }
}
