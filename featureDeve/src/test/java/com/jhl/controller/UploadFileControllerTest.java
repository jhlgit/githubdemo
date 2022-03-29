package com.jhl.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description
 * @Author jhl
 * @Date 2022/3/15 21:33
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@WebAppConfiguration
public class UploadFileControllerTest {

    public static final  String CLASS_PATH_RESOURCE="testFile";
    public static final  String FILE_NAME="test_20220301_1";
    public static final  String FIEL_CONTENTTYPE="txt";
    @Autowired
    UploadFileController uploadFileController;
    @Test
    public void test4uploadFile() throws Exception {
        File resourceFile = new File(CLASS_PATH_RESOURCE+File.separator+);
        MockMultipartFile mockMultipartFile=new MockMultipartFile("name",FILE_NAME+"."+FIEL_CONTENTTYPE,
                FIEL_CONTENTTYPE,new FileInputStream(resourceFile));
    }
}
