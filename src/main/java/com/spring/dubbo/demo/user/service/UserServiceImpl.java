package com.spring.dubbo.demo.user.service;

import com.spring.dubbo.demo.user.api.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public String getNameById(String uid) {
        System.out.println("receive request data:"+uid);
        // 省略数据库操作-333
        return "Mic";
    }
}
