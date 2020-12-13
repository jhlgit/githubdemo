package com.jhl.controller;



import com.jhl.base.BaseDeve;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
public class JavaSyntax extends BaseDeve {
    public void tempFunction() {
        float f = 3.499F;
        String a = "sfsfadsf";
        a.length();
        char c = '含';
    }
//@DurationUnit
//    private DataSize buffersize=DataSize.ofMegabytes(2);
    public static void main(String[] args) throws IOException {
//        System.out.println("abcd".length());
//        Car car = new Car();
//        System.out.println(car.hashCode());
//        car.setBrand("vvv");
//        String str1 = new String("aa2aa");
//        String str2 = new String("aa2aa");
//        System.out.println(str1 == str2);
/*
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jhl\\Desktop\\tmp.txt"));
        String line="";
        int i=1;
        while ( (line=br.readLine()) != null){
            if(line.length()>4){
                System.out.println(line.substring(1,3));
            }else{
                System.out.println(i+++line);
            }
        }*/

    }
}
