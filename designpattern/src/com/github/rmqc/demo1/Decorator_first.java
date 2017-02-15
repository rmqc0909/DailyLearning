package com.github.rmqc.demo1;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class Decorator_first extends Decorator {
    public Decorator_first(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜看看");
    }
    public void findMapOnfloor() {
        System.out.println("find map......");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMapOnfloor();
    }
}
