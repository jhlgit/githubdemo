package com.jhl.utils;

/**
 * @Description
 * @Author jhl
 * @Date 2021/8/8 10:23
 * @Version 1.0
 */
public class JhlStringUtils {

    public static String[] toHex(byte[] bytes){
        String[] reusltbytes=new String[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            reusltbytes[i]= Integer.toHexString(bytes[i]);
        }
        return reusltbytes;
    }

    public static String[] toHex(String str){
        String[] returnStr=new String[str.length()];
        for (int i = 0;i< str.length();i++){
            returnStr[i]=Integer.toHexString(str.charAt(i));
        }
        return returnStr;
    }
}