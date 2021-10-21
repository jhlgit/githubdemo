package com.jhl.practice;


import com.jhl.base.BaseDeve;
import com.jhl.entity.Car;
import com.jhl.utils.JhlStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JavaSyntaxTests extends BaseDeve {

    public static void main(String[] args) throws Exception {
        test4Charset();
    }

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


    private static void test4tmp() {
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
        String b = "\111";
        logger.info("String" + (' ' >= a));
        String UnicodeExtednB = "\uD840\uDC00\uD840\uDC01\uD840\uDC02\uD840\uDC03\uD840\uDC04\uD840\uDC05\uD840\uDC06" +
                "\uD840\uDC07\uD840\uDC08\uD840\uDC09"; //汉字 Unicode 编码扩展B，共42711字
        char UnicodeExtednBchar[] = new char[20];
        UnicodeExtednB.getChars(0, UnicodeExtednB.length(), UnicodeExtednBchar, 0);
        logger.info("UnicodeExtednB:" + UnicodeExtednB);
        logger.info(Integer.toHexString("r".charAt(0)));
        String str3 = "a$.b$.c";
        String strs[] = str3.split(".");
        for (String str : strs) {
            System.out.println(str);
        }
    }

    /**
     * @Description 字符串转char, 十六进制打印到控制台
     * @Author jhl
     * @Date 2021/8/8 10:12
     * @Version 1.0
     */

    private static void test4Charset() throws Exception{
        String text = new String("I am 中国汉贾三 \uD870\uDF17");//I am 中国汉贾三 𬌗

        logger.info("text:" + text);
        Charset utf_8charset = Charset.forName("UTF-8");
        Charset charset = StandardCharsets.ISO_8859_1;
        byte[] utf8_bytes = text.getBytes(utf_8charset);
        byte[] utf16_bytes = text.getBytes(StandardCharsets.UTF_16BE);
        String[] utf8_hex_bytes = JhlStringUtils.toHex(text);
        byte[] defaultBytes = text.getBytes();
        logger.info("utf8_bytes:" + Arrays.toString(utf8_bytes));
        logger.info("defaultBytes:" + Arrays.toString(defaultBytes));
        logger.info("utf16_bytes:" + Arrays.toString(utf16_bytes));

        logger.info("utf8_hex:" + Arrays.toString(utf8_hex_bytes));
        String utf8_test=new String(defaultBytes,"UTF-8");
        logger.info("utf8_test:" + utf8_test);
        //获取系统默认编码
        logger.info("系统默认编码：" + System.getProperty("file.encoding"));
        //系统默认字符编码
        logger.info("系统默认字符编码:" + Charset.defaultCharset());
        //操作系统用户使用的语言
        logger.info("系统默认语言:" + System.getProperty("user.language"));
    }

}
