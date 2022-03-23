package com.springcloud.facade;

import com.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by jiamin5 on 2022/3/15.
 */
@Service(cluster = "failover", loadbalance = "consistenthash")
public class HelloServiceImpl implements IHelloService {
    @Value("dubbo.protocol.name")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        String result = String.format("%s : Hello, %s", serviceName, name);
        System.out.println(result);
        return result;
    }
}
