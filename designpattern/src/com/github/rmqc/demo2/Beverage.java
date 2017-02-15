package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 */
public abstract class Beverage {
    protected String description = "Unknow ";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
