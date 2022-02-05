package com.jhl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author jhl
 * @Date 2021/10/5 10:08
 * @Version 1.0
 */
@Controller
public class HelloWord {

    @RequestMapping("/hello")
    public @ResponseBody Object hello(){

        return "hello";
    }
}
