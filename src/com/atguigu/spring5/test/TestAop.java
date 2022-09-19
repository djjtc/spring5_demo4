package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopAnno() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test
    public void testAopAnnot() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAop.class);
//        User user = context.getBean("user", User.class);
//        user.add();

        TestU testU = context.getBean("testU", TestU.class);
//        System.out.println(testU.name());
//        System.out.println(testU.uname());

        System.out.println(testU.nametest("代建军是天才中的天才！！！！！！！！！"));
    }
}
