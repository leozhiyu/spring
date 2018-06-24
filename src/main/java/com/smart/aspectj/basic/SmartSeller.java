/**
 * @author:Leo
 * @create 2018/6/21
 * @desc
 */
package com.smart.aspectj.basic;

public class SmartSeller implements Seller{
    public void sell(String name) {
        System.out.println("seller greet to " + name + "...");
    }
}
