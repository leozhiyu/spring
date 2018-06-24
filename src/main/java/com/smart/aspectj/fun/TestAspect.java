/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
    @AfterReturning("@annotation(com.smart.aspectj.anno.NeedTest)")
    public void neetTestFun() {
        System.out.println("needTestFun() executed...");
    }
}
