/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.aspectj;

import com.smart.advice.NaiveWaiter;
import com.smart.advice.Waiter;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class AspectJProxyTest {
    @Test
    public void proxy() {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        // 设置目标对象
        factory.setTarget(target);
        // 添加切面类
        factory.addAspect(PreGreetingAspect.class);
        // 生成织入切面的代理对象
        Waiter proxy = factory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("John");
    }
}
