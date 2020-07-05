package com.atguigu.designpattern.factory.factorymethod.pizzastore.order;



import com.atguigu.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式抽象类，将createPizza方法抽象，放在具体的实现类中实现。
 * 由于实现类不同，所负责创造出来的pizza也就不一样了
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String type);

    Pizza pizza = null;

    public OrderPizza() {
        while(true){
            String type = getType();
            pizza = createPizza(type);
            if (pizza !=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
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
