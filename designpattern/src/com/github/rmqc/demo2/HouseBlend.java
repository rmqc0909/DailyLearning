package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
