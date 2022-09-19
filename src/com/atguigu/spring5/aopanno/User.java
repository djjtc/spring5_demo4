package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

//被增强的类
@Component
public class User {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {

        this.name = name;

    }

    public void add() {
      //  int i = 10/0;
        System.out.println("add.......");
    }
}
