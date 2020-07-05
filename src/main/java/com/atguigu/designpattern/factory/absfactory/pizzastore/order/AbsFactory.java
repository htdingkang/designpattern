package com.atguigu.designpattern.factory.absfactory.pizzastore.order;

import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    public Pizza createPizza(String type);
}
