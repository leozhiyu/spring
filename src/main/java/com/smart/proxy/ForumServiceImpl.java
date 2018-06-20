/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.proxy;

public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {
        //PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeTopic");
        System.out.println("模拟删除 topic 记录 ： " + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        //PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除 forum 记录 ： " + forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //PerformanceMonitor.end();
    }
}
