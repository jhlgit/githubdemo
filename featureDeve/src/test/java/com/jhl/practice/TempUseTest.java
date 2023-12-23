package com.jhl.practice;


import com.jhl.FeatureApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={FeatureApplication.class},webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TempUseTest {

    @Autowired
    TempUse tempUse;

    @Test
    public void test4(){
        tempUse.test();
    }
}
