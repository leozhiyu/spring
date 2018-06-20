/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("please enjoy yourself");
    }
}
