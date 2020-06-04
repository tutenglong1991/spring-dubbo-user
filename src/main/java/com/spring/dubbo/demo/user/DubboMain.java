package com.spring.dubbo.demo.user;


import com.alibaba.fastjson.JSON;
import com.spring.dubbo.demo.user.service.impl.UserServiceImpl;
import com.spring.dubbo.demo.user.service.request.UserQueryReq;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboMain {
    public static void main(String[] args) throws IOException {
        //第一种方式
        ClassPathXmlApplicationContext context=new
            ClassPathXmlApplicationContext("classpath*:/META-INF/user-provider.xml");
//        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("userService");
        context.start();
//        UserQueryReq userQueryReq = new UserQueryReq();
//        userQueryReq.setId("1001");
//        System.out.println(JSON.toJSONString(userServiceImpl.getUserInfoById(userQueryReq)));
        System.in.read(); //阻塞Main线程
        //第二种方式
//        Main.main(args);
    }
}
