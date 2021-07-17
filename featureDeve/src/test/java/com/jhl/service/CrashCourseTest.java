package com.jhl.service;

import com.jhl.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description 调用方法
 * @Author jhl
 * @Date 2020/12/28 19:44
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@WebAppConfiguration
public class CrashCourseTest extends BaseTest {
    @Autowired
    CrashCourse crashCourse;

    @Test
    public void test4genertatisonData() {
        try {
            crashCourse.noTxGenertatisonData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("结束");
    }
}
