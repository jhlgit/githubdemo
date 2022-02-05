package com.jhl.controller;

import com.jhl.base.LogWriter;
import com.jhl.entity.pojo.Customers;
import com.jhl.entity.pojo.CustomersExample;
import com.jhl.entity.pojo.CustomersMapper;
import com.jhl.entity.pojo.Operation;
import com.jhl.service.AspectjTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    CustomersMapper customersMapper;
    @Autowired
    AspectjTest aspectjTest;

    @RequestMapping(value = "/q/{custId}", method = RequestMethod.GET)
    public @ResponseBody  Object queryUser(@PathVariable  Integer custId) {
        System.out.println("111111");
        LogWriter.info(this.getClass(),"queryUser开始");
        CustomersExample customersExample=new CustomersExample();
        customersExample.createCriteria().andCustIdEqualTo(custId);
        List<Customers> customers = customersMapper.selectByExample(customersExample);
        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.addAll(customers);
        aspectjTest.test();
        LogWriter.info(this.getClass(),"queryUser结束");
        return objectArrayList;
    }
    public static void main(String[] args) {
        ArrayList<Operation> list = new ArrayList<Operation>();
        System.out.println(list.size());
        list=null;
        for (Operation operation : list) {
            System.out.println(operation);
        }
    }
}

