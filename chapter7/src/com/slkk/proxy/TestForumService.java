package com.slkk.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class TestForumService {
    public static void main(String[] args) {
//        ForumServiceImpl forumService = new ForumServiceImpl();
//        forumService.removeForum(10);
//        forumService.removeTopic(200);

        ForumServiceImpl target = new ForumServiceImpl();
        PerformaceHandler handler = new PerformaceHandler(target);
        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass()
                .getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        proxy.removeForum(10);
        proxy.removeTopic(100);
    }
}
