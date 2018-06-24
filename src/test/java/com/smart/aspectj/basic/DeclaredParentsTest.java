/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.basic;

import com.smart.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeclaredParentsTest {
    public static void main(String[] args) {
        String configPath = "aspectj.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        waiter.greetTo("John");
        Seller seller = (Seller) waiter;
        seller.sell("Beer");
    }
}
