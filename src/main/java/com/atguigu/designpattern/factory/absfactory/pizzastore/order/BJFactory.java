package com.atguigu.designpattern.factory.absfactory.pizzastore.order;

import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 这是一个工厂子类 BJ
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用北京的抽象工厂模式");
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
