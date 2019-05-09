package com.xcy.entity;

/**
 * @Author: xuchenyi
 * @Date: 2019-05-04 11:16
 * @Version 1.0
 */
public class User {
    private String userName;
    private Integer age;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
