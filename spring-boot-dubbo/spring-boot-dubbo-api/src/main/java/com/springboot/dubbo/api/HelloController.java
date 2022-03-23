package com.springboot.dubbo.api;

import com.springboot.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiamin5 on 2022/3/14.
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    @Reference(url = "dubbo://127.0.0.1:20880/com.springboot.dubbo.IHelloService")
    private IHelloService helloService;

    @RequestMapping("/get")
    public String sayHello(){
        System.out.println("HelloController api get id 123");
        String result = helloService.sayHelloById(123);
        return result;
    }

}
