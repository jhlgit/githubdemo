package com.jhl.controller;

import com.jhl.DTO.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class UserController {

    @RequestMapping(value = "/q", method = RequestMethod.GET)
    public @ResponseBody  Object queryUser() {
        System.out.println("111111");
        String message = "Hello world from Spring MVC";
        Car car = new Car();
        car.setBrand("aodi");
        car.setProductDate(new Date());
        ArrayList<Object> objectArrayList = new ArrayList<>();
        String s = new String();
        s.hashCode();
        objectArrayList.add(car);
        return objectArrayList;
    }
}

