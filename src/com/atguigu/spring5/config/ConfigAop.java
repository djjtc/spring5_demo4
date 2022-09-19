package com.atguigu.spring5.config;

import com.atguigu.spring5.aopanno.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.atguigu"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
    @Bean(value = "tbzrtest")
    public User u(){
        User user = new User("djjtc对我是一个天才！");
        return user;
    }

    @Bean
    public User user(){
        User user = new User("djjtc你真是个天才！！！");
        return user;
    }
}
