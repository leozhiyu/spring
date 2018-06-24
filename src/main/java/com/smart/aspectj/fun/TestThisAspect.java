/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestThisAspect {
    @AfterReturning("this(Seller)")
    public void thisTest() {
        System.out.println("thisTest() executed!");
    }
}
