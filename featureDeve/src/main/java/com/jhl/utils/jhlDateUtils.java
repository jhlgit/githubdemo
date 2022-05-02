package com.jhl.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author jhl
 * @Date 2022/4/11 21:16
 * @Version 1.0
 */
public class jhlDateUtils {

    public static void getDateTime(){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        String format = simpleDateFormat.format(date);
    }
    public static void getCurrentDateTime(){

    }
}
