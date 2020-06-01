package com.spring.dubbo.demo.user.service.api;


import com.spring.dubbo.demo.user.service.request.UserQueryReq;
import com.spring.dubbo.demo.user.service.response.UserRespModel;

public interface IUserService {
    UserRespModel getUserInfoById(UserQueryReq req);
}