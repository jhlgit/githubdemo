package com.jhl.controller;

import com.jhl.FeatureApplication;
import com.jhl.base.LogWriter;
import com.jhl.utils.SpringBeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

/**
 * @Description
 * @Author jhl
 * @Date 2022/3/15 21:33
 * @Version 1.0
 */
@SpringBootTest(classes= FeatureApplication.class)
@RunWith(SpringRunner.class)
//@WebAppConfiguration
public class UploadFileControllerTest {

    public static final  String CLASS_PATH_RESOURCE="testFile";
    public static final  String FILE_NAME="test_20220301_1";
    public static final  String FIEL_CONTENTTYPE="txt";
    @Autowired
    UploadFileController uploadFileController;
    @MockBean(reset= MockReset.NONE)
    UserController userController;
    public void test4uploadFile() throws Exception {
        File resourceFile = new File(CLASS_PATH_RESOURCE+File.separator);
        MockMultipartFile mockMultipartFile=new MockMultipartFile("name",FILE_NAME+"."+FIEL_CONTENTTYPE,
                FIEL_CONTENTTYPE,new FileInputStream(resourceFile));
    }

    @Test
    public void test4writeFile(){

        String filePath=CLASS_PATH_RESOURCE+File.separator+FILE_NAME+"."+FIEL_CONTENTTYPE;
        File fileDir=new File(CLASS_PATH_RESOURCE);
        BufferedWriter bufferedWriter=null;
        try {
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            fileDir.isDirectory();
            File file=new File(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            bufferedWriter=new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("123456");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        LogWriter.info(this.getClass(),"CrashCourseTest.userController:{},{}",userController.getClass().getName(),Integer.toHexString(userController.hashCode()));
        LogWriter.info(this.getClass(),"CrashCourseTest.UserController:{},{}", SpringBeanUtils.getBean("userController").getClass().getName(),Integer.toHexString(SpringBeanUtils.getBean("userController").hashCode()));
        LogWriter.info(this.getClass(),"结束"+SpringBeanUtils.getApplicationContext());
    }
}
