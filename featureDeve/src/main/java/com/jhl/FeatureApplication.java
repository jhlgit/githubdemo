package com.jhl;

import com.jhl.practice.Tmp1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @Description
 * @Author jhl
 * @Date 2022/3/15 21:29
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = Tmp1.class) })
public class FeatureApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeatureApplication.class, args);
    }
}
