package com.atguigu.designpattern.factory.simplefactory.pizzastore.order;

import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂创建pizza");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("PepperPizza");
        }
        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂创建pizza");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("PepperPizza");
        }
        return pizza;
    }
}
