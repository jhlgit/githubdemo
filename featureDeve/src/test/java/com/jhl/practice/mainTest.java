package com.jhl.practice;

import org.apache.commons.lang3.StringUtils;

public class mainTest {

    public static void main(String[] args) {
        String a=" abc 前面是半角　";
        String b= StringUtils.strip(a);
        System.out.println(a+a.length()+"\n"+b+b.length());
    }
}
