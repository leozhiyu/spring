/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.advice;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class BeforeAdviceTest {
    @Test
    public void before() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setOptimize(true);
        pf.setTarget(target);
        pf.addAdvice(advice);

        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}