package com.spring.dubbo.demo.user.service.response;


import java.io.Serializable;

public class UserRespModel implements Serializable{
    private static final long serialVersionUID = 1L;

    private String userId;
    private String name;
    private int age;
    private String address;

    public UserRespModel() {
    }

    public UserRespModel(String userId, String name, int age, String address) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return userId;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
