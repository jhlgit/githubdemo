package com.jhl.practice;

import com.jhl.FeatureApplication;
import com.jhl.base.LogWriter;
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
public class TempTest2 {
    @Autowired
    TempUse tempUse;
    @MockBean
    private  CrashCourse crashCourse;

    @Test
    public void test4(){
        int n= 1;
        LogWriter.info(this.getClass(),"TempTest2");
    }

    public boolean n2(int n){
        int tmp=1;
        int x=0;
         while (tmp<=n){
             if(n==1 && x==0){
                 return true;
             }
             x++;
             tmp=tmp*2;
             if(tmp == n){
                 return true;
             }
         }
         return false;
    }
}
