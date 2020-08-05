package com.atguigu.designpattern.decorator;
/**
 * 被装饰者对象
 */
public class DeCaf extends Coffee{
    public DeCaf() {
        setPrice(8.0f);
        setDesc(" 无因咖啡 ");
    }
}
