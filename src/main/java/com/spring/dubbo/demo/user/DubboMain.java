package com.spring.dubbo.demo.user;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboMain {
    public static void main(String[] args) throws IOException {
        //第一种方式
        ClassPathXmlApplicationContext context=new
            ClassPathXmlApplicationContext("classpath*:/META-INF/user-provider.xml");
        context.start();
        System.in.read(); //阻塞Main线程
        //第二种方式
//        Main.main(args);
    }
}
