/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.fun;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointcutFunTest {
    @Test
    public void pointcut(){
        String configPath = "aspectj.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naughtyWaiter.greetTo("hello");
    }

    @Test
    public void thisTest(){
        String configPath = "aspectj.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("server");
        ((Seller)naiveWaiter).sell("beer","john");
    }
}
