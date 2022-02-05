package com.jhl.service;

import com.jhl.base.BaseDeve;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author jhl
 * @Date 2021/11/18 21:57
 * @Version 1.0
 */
@Component
public class AspectjTest extends BaseDeve {
    @Override
    public void test(){
        logger.info("AspectjTest.test");
    }
}
