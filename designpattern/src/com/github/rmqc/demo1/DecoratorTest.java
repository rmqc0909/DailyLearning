package com.github.rmqc.demo1;

import org.junit.Test;

/**
 * Created by xiedan11 on 2017/2/14.
 */
public class DecoratorTest {
    @Test
    public void test() {
        Person person = new Person();
        Decorator decorator = new Decorator_second(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
    @Test
    public void test1() {
        System.out.println("jjjjj");
    }

}
