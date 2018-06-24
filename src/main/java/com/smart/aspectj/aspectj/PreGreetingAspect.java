/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 通过注解将该类标识为一个切面
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))") // 定义切点和增强类型
    public void beforeGreeting() { // 增强的横切逻辑
        System.out.println("How are you");
    }
}
