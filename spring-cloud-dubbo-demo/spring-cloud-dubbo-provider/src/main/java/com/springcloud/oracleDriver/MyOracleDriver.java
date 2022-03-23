package com.springcloud.oracleDriver;

/**
 * Created by jiamin5 on 2022/3/16.
 */
public class MyOracleDriver implements OracleDriver {
    @Override
    public String connect() {
        return "Oracle driver connect!!";
    }
}
