package com.atguigu.designpattern.decorator;

/**
 * 被装饰者父类
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
