package com.springcloud.facade;

import com.springcloud.driver.Driver;
import com.springcloud.oracleDriver.OracleDriver;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

/**
 * Created by jiamin5 on 2022/3/15.
 */
@SpringBootApplication
@DubboComponentScan
public class SpringCloudDubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboProviderApplication.class);
        //JAVA SPI 方式导入Driver
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        for (Driver driver : serviceLoader) {
            System.out.println(driver.connect());
        }
        //Dubbo @SPI 注解的方式导入Driver， 只会扫描services，dubbo，internal其中一个
        ExtensionLoader<OracleDriver> extensionLoader=ExtensionLoader.getExtensionLoader(OracleDriver.class);
        OracleDriver driver=extensionLoader.getExtension("oracleDriver");
        System.out.println(driver.connect());
    }
}
