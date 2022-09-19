package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ZL-ONE
 * @create 2022-07-16 13:37
 */
@Component
public class TestU {
    @Autowired
    @Qualifier(value = "tbzrtest")
    private User uuser;
    @Autowired
    private User user;
    public String name(){
        return this.user.getName();
    }

    public String uname(){
        return this.uuser.getName();
    }

    public String nametest(String name){
        this.user.setName(name);
        return this.user.getName();
    }
}
