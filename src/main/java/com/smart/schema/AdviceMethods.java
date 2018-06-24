/**
 * @author:Leo
 * @create 2018/6/24
 * @desc
 */
package com.smart.schema;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceMethods {
    public void preGreeting() {
        System.out.println("-- how are you --");
    }

    public void afterReturing(int retVal) {

    }

    public void aroundMethod(ProceedingJoinPoint pjp) {

    }
}
