package com.github.rmqc;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class Decorator_second extends Decorator {
    public Decorator_second(Human human) {
        super(human);
    }

    public void findCloses() {
        System.out.println("find closes...");
    }

    public void findTheTarget() {
        System.out.println("find the garden and park...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findCloses();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}

