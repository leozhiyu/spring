/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestForumService {
    @Test
    public void test01() {
        ForumService forumService = new ForumServiceImpl();
        forumService.removeForum(10);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        forumService.removeTopic(1024);
    }

    @Test
    public void proxytest() {

        ForumService target = new ForumServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
                );
        proxy.removeForum(10);
        proxy.removeTopic(1024);
    }

    @Test
    public void cglibTest() {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        forumService.removeTopic(1024);
    }
}
