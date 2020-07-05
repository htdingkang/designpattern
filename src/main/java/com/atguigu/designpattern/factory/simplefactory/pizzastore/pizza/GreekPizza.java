package com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizza Prepare");
    }
}
