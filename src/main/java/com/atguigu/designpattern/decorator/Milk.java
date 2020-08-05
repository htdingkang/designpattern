package com.atguigu.designpattern.decorator;

/**
 * 装饰者对象
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setPrice(2.0f);
        setDesc(" 牛奶 ");
    }
}
