package com.springcloud.api;

import com.springcloud.dubbo.IHelloService;

/**
 * Created by jiamin5 on 2022/3/15.
 */
public class MockHelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "sorry .服务不可用";
    }
}
