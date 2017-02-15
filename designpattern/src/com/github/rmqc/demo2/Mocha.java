package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and Mocha";
    }
}
