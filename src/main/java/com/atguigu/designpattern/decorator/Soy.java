package com.atguigu.designpattern.decorator;

/**
 * 装饰者对象
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setPrice(1.5f);
        setDesc(" 豆浆 ");
    }
}
