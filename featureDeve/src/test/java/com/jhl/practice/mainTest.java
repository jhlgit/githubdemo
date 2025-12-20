package com.jhl.practice;

import com.jhl.base.LogWriter;
import org.apache.commons.lang3.StringUtils;

public class mainTest {

    public static void main(String[] args) {
        String a=" abc 前面是半角　";
        String b= StringUtils.strip(a);
        System.out.println(a+a.length()+"\n"+b+b.length());

        int n= 1024;
        boolean result= n2(n);
        LogWriter.info(mainTest.class,"TempTest2,n:{},result:{}",n,result);
    }


    public static boolean n2(int n){
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

    public void  a(long num ){
        String s = String.valueOf(num);
//        Character.isLetter();
    }
}
