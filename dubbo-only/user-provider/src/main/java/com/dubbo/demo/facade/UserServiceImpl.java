package com.dubbo.demo.facade;

import com.dubbo.demo.IUserService;

/**
 * Created by jiamin5 on 2022/3/14.
 */
public class UserServiceImpl implements IUserService {
    public String getUserInfoById(Integer userId) {
        System.out.println("UserServiceImpl implements userId:{}"+ userId);
        return "this is my mane : ljm";
    }
}
