/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.advice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class BeforeAdviceXMLTest {
    @Test
    public void before() {
        String configPath = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
    }

    @Test
    public void ex() throws SQLException {
        String configPath = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService transactionManager = (ForumService) ctx.getBean("forumService");
        transactionManager.removeForum(1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        transactionManager.updateForum();
    }
}
