/**
 * @author:Leo
 * @create 2018/6/21
 * @desc
 */
package com.smart.advisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAdvisorTest {
    @Test
    public void test01() {
        String configPath = "advisor.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        Seller seller = (Seller) applicationContext.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("John");
    }

    @org.testng.annotations.Test
    public void test02() {
        String configPath = "advisor.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
