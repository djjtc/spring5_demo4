package com.atguigu.spring5.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ZL-ONE
 * @create 2022-07-16 13:43
 */
//增强的类
@Component
@Aspect  //生成代理对象
@Order(1)
public class TestUProxy {

    //相同切入点抽取
//    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
//    public void pointdemo() {
//
//    }

//    前置通知
//    @Before注解表示作为前置通知
//    @Before(value = "pointdemo()")
//    public void before() {
//        System.out.println("before.........");
//    }

    //args(i)，里边的i是被增强类的返回值
    @Before(value = "execution(* com.atguigu.spring5.test.TestU.name())")
    public void before() throws Throwable {

        System.out.println("before.........");
        return;
    }

    //环绕通知
    @Around(value = "execution(* com.atguigu.spring5.test.TestU.name())")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");

        //被增强的方法执行，proceed为被增强方法返回值
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed);

        System.out.println("环绕之后.........");
        return proceed;
    }

    @Around(value = "execution(* com.atguigu.spring5.test.TestU.nametest(..))")
    public Object nametestaround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕之前.........");
//        boolean t = false;
//        Object[] args = proceedingJoinPoint.getArgs();
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i].getClass());
//            args[i] = "我是经过环绕改变值的新内容——————";
//            t = true;
//        }
//        if (t) {
//            //被增强的方法执行，proceed为被增强方法返回值
//            Object proceed = proceedingJoinPoint.proceed(args);
//            System.out.println(proceed);
//
//            System.out.println("环绕之后.........");
//            return proceed;
//        } else {
//            return null;
//        }
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed.getClass());
        proceed="环绕更改了值！";
        System.out.println("环绕之后.........");
        return proceed;
    }


//    @Before(value = "execution(* com.atguigu.spring5.test.TestU.nametest(String)) and args(str)")
//    public String beforet(String str) throws Throwable {
//
//        str="我经过before的处理啊...........";
//        System.out.println("before........."+str);
//        return str;
//    }
}
