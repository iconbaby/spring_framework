package com.slkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class chapter5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Foo foo = (Foo) context.getBean("foo");
        foo.setiDcode("23");

    }
}
