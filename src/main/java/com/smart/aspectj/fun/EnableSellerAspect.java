/**
 * @author:Leo
 * @create 2018/6/22
 * @desc
 */
package com.smart.aspectj.fun;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {
    @DeclareParents(value = "com.smart.aspectj.fun.NaiveWaiter", defaultImpl = SmartSeller.class)
    public static Seller seller;
}
