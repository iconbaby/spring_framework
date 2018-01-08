package com.slkk.advice;

import org.springframework.aop.framework.ProxyFactory;

public class BeforeAdviceTest {
    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        GreetingBeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("john");
        proxy.serveTo("Tom");
    }
}
