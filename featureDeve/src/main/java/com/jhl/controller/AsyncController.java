package com.jhl.controller;

import com.alibaba.fastjson.JSON;
import com.jhl.base.LogWriter;
import com.jhl.entity.dto.Person;
import com.jhl.utils.ThreadPoolUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("async")
public class AsyncController {

    @RequestMapping("/createPerson")
    public DeferredResult<Person> createPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        DeferredResult<Person> deferredResult=new DeferredResult(100*000L);
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolUtils.gethreadPool();
        threadPoolExecutor.execute(()->{
            LogWriter.info(this.getClass(),"业务处理开始");
            try {
                Thread.sleep(4*1000);
                Person person=new Person();
                person.setName("async");
                deferredResult.setResult(person);
            } catch (InterruptedException e) {
                LogWriter.error(this.getClass(),"业务处理",e);
            }
            LogWriter.info(this.getClass(),"业务处理结束");
        });
        LogWriter.info(this.getClass(),"createPerson:{}",JSON.toJSONString("1"));
        return deferredResult;
    }
}
