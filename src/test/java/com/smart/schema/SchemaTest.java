/**
 * @author:Leo
 * @create 2018/6/24
 * @desc
 */
package com.smart.schema;

import com.smart.aspectj.fun.NaughtyWaiter;
import com.smart.aspectj.fun.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaTest{
    @Test
    public void test() {
        String configPath = "schema/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter)ctx.getBean("naiveWaiter");
        NaughtyWaiter naughtyWaiter = (NaughtyWaiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naughtyWaiter.greetTo("Tom");
    }


}
