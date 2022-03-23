package com.springboot.dubbo.provider;

import com.springboot.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by jiamin5 on 2022/3/14.
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Value("dubbo.application.name")
    private String applicationName;


    public String sayHelloById(Integer id) {
        String result = String.format(" %s sayHelloByid id is %s",applicationName, id);
        System.out.println(result);
        return result;
    }
}
