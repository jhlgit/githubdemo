package com.jhl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jhl.entity.Car;

/**
 * @description
 * @author jhl
 * @create 2018年8月28日下午10:31:58
 */
@Controller
@RequestMapping("tempcontroller")
public class tempcontroller {
    private String name;




    private <T> T commonAddress (){
        Car car = new Car();
        Car car2 = new Car();
        System.out.println("car:"+Integer.toHexString(car.hashCode())+","+System.identityHashCode(car)+car.toString());
        return null;
    }
    public static void main(String[] args) {
        tempcontroller tempcontroller= new tempcontroller();
        try {
//            tempcontroller.fast();
//            tempcontroller.commonAddress();
        } catch (Exception e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
        }
    }
}
