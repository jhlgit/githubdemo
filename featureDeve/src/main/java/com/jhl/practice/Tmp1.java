package com.jhl.practice;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Tmp1 {

    public static Map map=new HashMap();

    private Tmp1(){
        if(map.size()>0){
            throw new RuntimeException("map第二次赋值");
        }
        map.put("1","1");
    }
}
