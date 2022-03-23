package com.dubbo.demo.api;

import com.dubbo.demo.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiamin5 on 2022/3/14.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        String userName = userService.getUserInfoById(2);
        System.out.println(userName);
    }
}
