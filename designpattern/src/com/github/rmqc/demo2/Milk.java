package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 * 装饰者需要包含一个被装饰者对象，在本例中即为：Beverage
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and Milk";
    }
}
