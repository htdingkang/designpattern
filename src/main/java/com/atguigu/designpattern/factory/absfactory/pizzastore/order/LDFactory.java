package com.atguigu.designpattern.factory.absfactory.pizzastore.order;

import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.*;

/**
 * 这是一个工厂子类
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用伦敦的抽象工厂模式");
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
