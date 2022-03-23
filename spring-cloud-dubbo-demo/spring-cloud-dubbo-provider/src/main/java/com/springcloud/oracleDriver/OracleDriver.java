package com.springcloud.oracleDriver;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by jiamin5 on 2022/3/16.
 */
@SPI("dubbo")
public interface OracleDriver {
    String connect();
}
