package com.springcloud.driver;

/**
 * Created by jiamin5 on 2022/3/16.
 */
public class MySqlDriver implements Driver {
    @Override
    public String connect() {
        return "mySql connect databases!";
    }
}
