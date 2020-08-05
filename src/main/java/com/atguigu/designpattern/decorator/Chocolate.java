package com.atguigu.designpattern.decorator;

/**
 * 装饰者对象
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setPrice(3.0f);
        setDesc(" 巧克力 ");
    }
}
