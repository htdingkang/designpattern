package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;

public class Client {
    public static void main(String[] args) {
        //北京的pizza订购
        //new BJOrderPizza();
        //伦敦的pizza订购
        new LDOrderPizza();
    }
}
