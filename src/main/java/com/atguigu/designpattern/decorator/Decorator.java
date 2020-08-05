package com.atguigu.designpattern.decorator;

/**
 * 装饰者父类
 */
public class Decorator extends Drink {
    /**
     * 被装饰的对象  这里指  咖啡
     */
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + drink.getDesc() ;
    }
}
