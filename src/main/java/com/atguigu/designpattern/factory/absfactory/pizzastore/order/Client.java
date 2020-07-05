package com.atguigu.designpattern.factory.absfactory.pizzastore.order;

public class Client {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
