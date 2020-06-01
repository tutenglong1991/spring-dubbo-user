package com.spring.dubbo.demo.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.spring.dubbo.demo.user.service.api.IUserService;
import com.spring.dubbo.demo.user.service.request.UserQueryReq;
import com.spring.dubbo.demo.user.service.response.UserRespModel;

/**
 @Component
 @Service
 @Repository
 */
//@Service
public class UserServiceImpl implements IUserService {

    @Override
    public UserRespModel getUserInfoById(UserQueryReq req) {
        String userId = req.getId();
        UserRespModel userRespModel = new UserRespModel();
        // 先使用造的数据代替数据库查询
        switch (userId) {
            case "1":
                userRespModel.setId(userId);
                userRespModel.setName("张三");
                userRespModel.setAge(45);
                userRespModel.setAddress("深圳宝安");
            case "2":
                userRespModel.setId(userId);
                userRespModel.setName("李四");
                userRespModel.setAge(30);
                userRespModel.setAddress("上海");
            default:
                userRespModel.setId(userId);
                userRespModel.setName("小明");
                userRespModel.setAge(25);
                userRespModel.setAddress("北京");
        }
        System.out.println(JSON.toJSONString(userRespModel));
        return userRespModel;
    }
}
