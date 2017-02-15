package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
