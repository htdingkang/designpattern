package com.atguigu.designpattern.factory.simplefactory.pizzastore.order;

import com.atguigu.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/**
 * 本类属于业务逻辑类，真实开发环境会有很多这样的类，都用到 Pizza对象实例。
 * 如果直接在本类中处理createPizza逻辑的话，那么将不利于代码维护，Pizza改变的话，多处需要修改create逻辑。
 * 于是将pizza的创建逻辑专门封装到了simpleFactory简单工厂中。
 */
public class OrderPizza {
    SimpleFactory factory;

    Pizza pizza = null;

    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);
    }

    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
        while (true) {
            String type = getType();
            Pizza pizza = this.factory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
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
