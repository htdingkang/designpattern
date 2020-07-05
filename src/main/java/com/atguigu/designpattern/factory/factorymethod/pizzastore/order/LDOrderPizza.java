package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;


import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.*;

public class LDOrderPizza extends OrderPizza {
    Pizza createPizza(String type) {
        System.out.println("使用工厂方法模式创建pizza");
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (type.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
