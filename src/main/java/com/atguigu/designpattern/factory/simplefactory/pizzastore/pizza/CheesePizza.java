package com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza Prepare");
    }
}
