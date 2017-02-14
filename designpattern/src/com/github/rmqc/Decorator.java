package com.github.rmqc;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public abstract class Decorator implements Human {
    private Human human;


    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        this.human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        this.human.walkToWhere();
    }
}
