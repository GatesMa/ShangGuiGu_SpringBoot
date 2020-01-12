package com.gatesma.springboot.bean;

/**
 * Copyright (C), 2020
 * FileName: Dog
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 07:50
 * Description:
 */
public class Dog {

    private String name;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
