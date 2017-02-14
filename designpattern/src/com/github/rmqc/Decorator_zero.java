package com.github.rmqc;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class Decorator_zero extends Decorator {

    public Decorator_zero(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("go home...");
    }

    public void findMaps() {
        System.out.println("find maps...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMaps();
    }
}
