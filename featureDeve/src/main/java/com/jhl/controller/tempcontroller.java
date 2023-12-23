package com.jhl.controller;


import com.alibaba.fastjson.JSON;
import com.jhl.base.LogWriter;
import com.jhl.entity.Car;
import com.jhl.entity.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description
 * @author jhl
 * @create 2018年8月28日下午10:31:58
 */
@Controller
@RequestMapping("tmpc")
public class tempcontroller {
    private String name;


    @RequestMapping("/createPerson")
    public void createPerson(Person person, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name1 = person.getName();
        LogWriter.info(this.getClass(),"", JSON.toJSONString(person));
        response.setContentType("application/x-javascript");
        response.getWriter().println("<script>location.href=http://127.0.0.1/form.html</script>");
        LogWriter.info(this.getClass(),"createPerson:{}",JSON.toJSONString(person));
    }

    @RequestMapping("/createPersonJson")
    @ResponseBody
    public void createPersonJson(@RequestBody Person person, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name1 = person.getName();
        LogWriter.info(this.getClass(),"", JSON.toJSONString(person));
        response.setContentType("application/x-javascript");
        response.getWriter().println("<script>location.href=http://127.0.0.1/form.html</script>");
        LogWriter.info(this.getClass(),"createPersonJson:{}",JSON.toJSONString(person));
    }


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
