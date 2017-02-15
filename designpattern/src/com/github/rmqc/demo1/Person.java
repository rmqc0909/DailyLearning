package com.github.rmqc.demo1;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("wear what...");
    }

    @Override
    public void walkToWhere() {
        System.out.println("start walking...");
    }
}
