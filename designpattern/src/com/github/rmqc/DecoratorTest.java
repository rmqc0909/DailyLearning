package com.github.rmqc;

import org.junit.Test;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class DecoratorTest {
    @Test
    public void test() {
        Person person = new Person();
        Decorator decorator = new Decorator_second(new Decorator_first(new Decorator_first(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
    @Test
    public void test1() {
        System.out.println("jjjjj");
    }

}
