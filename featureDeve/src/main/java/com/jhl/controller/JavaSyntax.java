package com.jhl.controller;


import com.jhl.base.BaseDeve;
import com.jhl.entity.Car;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
public class JavaSyntax extends BaseDeve {
    public void tempFunction() {
        float f = 3.499F;
        String a = "sfsfadsf";
        a.length();
        char c = '\u1111';
        logger.info("tempFunction");
    }

    private void tempFunction2(String tmp) {

        logger.info("tempFunction2:" + tmp);
    }

    //@DurationUnit
//    private DataSize buffersize=DataSize.ofMegabytes(2);
    public static void main(String[] args) throws IOException {
        System.out.println("abcd".length());
        Car car = new Car();
        System.out.println(car.hashCode());
        car.setBrand("vvvqq");
        String str1 = new String("aa2aa");
        String str2 = new String("aa2aa");
        System.out.println(str1 == str2);

        //文件读取
/*        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jhl\\Desktop\\tmp.txt"));
        String line="";
        int i=1;
        while ( (line=br.readLine()) != null){
            if(line.length()>4){
                System.out.println(line.substring(1,3));
            }else{
                System.out.println(i+++line);
            }
        }*/

        System.out.println("tirm(\" abc\\r\\n \"):" + String.valueOf(StringUtils.trim(" abc\r\n "))); //trim 回车换行也会去掉
        char a = '我';
        String b="\111";
        logger.info("String" + (' ' >= a));
        String UnicodeExtednB = "\uD840\uDC00\uD840\uDC01\uD840\uDC02\uD840\uDC03\uD840\uDC04\uD840\uDC05\uD840\uDC06" +
                "\uD840\uDC07\uD840\uDC08\uD840\uDC09"; //汉字 Unicode 编码扩展B，共42711字
        char UnicodeExtednBchar[] = new char[20];
        UnicodeExtednB.getChars(0,UnicodeExtednB.length(),UnicodeExtednBchar,0);
        logger.info("UnicodeExtednB:" + UnicodeExtednB);
        logger.info(Integer.toHexString("r".charAt(0)));
        String str3="a$.b$.c";
        String strs[]=str3.split(".");
        for(String str:strs){
            System.out.println(str);
        }
    }
}
