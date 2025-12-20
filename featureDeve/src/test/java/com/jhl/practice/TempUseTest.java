package com.jhl.practice;


import com.jhl.FeatureApplication;
import com.jhl.base.LogWriter;
import com.jhl.controller.UserController;
import com.jhl.service.CrashCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.junit4.SpringRunner;
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = Tmp1.class) })
@RunWith(SpringRunner.class)
@SpringBootTest(classes={FeatureApplication.class},webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class TempUseTest{

    @Autowired
    TempUse tempUse;
    @MockBean
    private CrashCourse crashCourse;
    @MockBean()
    UserController userController;
    @Test
    public void test4(){
        LogWriter.info(this.getClass(),"TempUseTest");
        tempUse.test();
    }
}
