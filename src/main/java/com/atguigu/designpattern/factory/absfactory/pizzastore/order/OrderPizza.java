package com.atguigu.designpattern.factory.absfactory.pizzastore.order;

import com.atguigu.designpattern.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    Pizza pizza = null;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        this.factory = factory;


        while (true) {
            String type = getType();
            pizza = factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }

    }

    public String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza category:");
        String s = "";
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
