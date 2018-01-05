package com.slkk.proxy;

public class ForumServiceImpl implements ForumService {
    @Override
    public void removeTopic(int topicId) {
//        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeTopic");
        System.out.println("模拟删除Topic记录：" + topicId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int forumId) {
//        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除forum记录：" + forumId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
//        PerformanceMonitor.end();
    }
}
