package com.atguigu.designpattern.decorator;


/**
 * 装饰者与被装饰者统一父类，抽象类
 */
public abstract class Drink {
    private float price = 0.0f;
    private String desc;

    /**
     * 计算费用的方法，子类来实现
     * @return
     */
    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
