package com.springcloud.api;

import com.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiamin5 on 2022/3/15.
 */
@RestController
public class HelloController {

    @Reference(mock = "com.springcloud.api.MockHelloService", cluster = "failover")
    private IHelloService helloService;

    @RequestMapping("/say")
    public String sayHello(String name){
        String result = helloService.sayHello(name);
        return result;
    }
}
