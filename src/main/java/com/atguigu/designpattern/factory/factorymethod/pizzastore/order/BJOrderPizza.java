package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;


import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    Pizza createPizza(String type) {
        System.out.println("使用工厂方法模式创建pizza");
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (type.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
