package com.jhl.controller;

import com.jhl.temp.dto.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/q", method = RequestMethod.GET)
    public @ResponseBody Car queryUser(){
        System.out.println("111111");
        String message = "Hello world from Spring MVC";
        Car  car=new Car();
        car.setBrand("aodi");
        return car;
    }
}
