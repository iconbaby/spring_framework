package com.slkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by slkk on 2018/1/4.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld hello = (HelloWorld) classPathXmlApplicationContext.getBean("hello");
        hello.sayHello();
    }
}
