package com.jhl.service;

import com.jhl.BaseTest;
import com.jhl.base.RootConfig;
import com.jhl.base.WebAppInitializer;
import com.jhl.base.WebConfig;
import com.jhl.entity.pojo.ProductsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 调用方法
 * @Author jhl
 * @Date 2020/12/28 19:44
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebAppInitializer.class,RootConfig.class,WebConfig.class})
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

    /**
     * @Description 生成订单信息
     * @Author jhl
     * @Date 2022/2/7 21:06
     * @Version 1.0
     */
    @Test
    public void test4noTxGenOneOrder() {
        try {
            Map<String, String> priceMap = new HashMap();
            crashCourse.productPrice(priceMap, new ProductsExample());
            crashCourse.noTxGenOneOrder(priceMap, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("结束");
    }
}
