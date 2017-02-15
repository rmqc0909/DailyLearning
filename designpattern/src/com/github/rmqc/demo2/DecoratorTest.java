package com.github.rmqc.demo2;

import org.junit.Test;

/**
 * Created by xiedan11 on 2017/2/15.
 */
public class DecoratorTest {
    @Test
    public void test() {
        Beverage beverage = new Espresso();
        System.out.println("Espresso's cost: " + beverage.getCost());
        System.out.println("Espresso's descriptionn: " + beverage.getDescription());
        beverage = new Milk(beverage);
        System.out.println("Espresso with milk's cost: " + beverage.getCost());
        System.out.println("Espresso with milk's descriptionn: " + beverage.getDescription());
        beverage = new Mocha(beverage);
        System.out.println("Espresso with milk and mocha's cost: " + beverage.getCost());
        System.out.println("Espresso with milk and mocha's descriptionn: " + beverage.getDescription());
        beverage = new Mocha(beverage);
        System.out.println("Espresso with milk and mocha and mocha's cost: " + beverage.getCost());
        System.out.println("Espresso with milk and mocha and mocha's descriptionn: " + beverage.getDescription());
    }
}
