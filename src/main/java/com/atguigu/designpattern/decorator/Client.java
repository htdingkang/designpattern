package com.atguigu.designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        // 1. 点一份 意大利咖啡
        Drink order = new Espresso();
        System.out.println("费用=" + order.cost());
        System.out.println("描述=" + order.getDesc());

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDesc());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDesc());

        // 4. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDesc());

        System.out.println("===========================");

        Drink order2 = new DeCaf();

        System.out.println("order2 无因咖啡  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 描述 = " + order2.getDesc());

        order2 = new Soy(order2);

        System.out.println("order2 无因咖啡 加入一份豆浆  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 加入一份豆浆 描述 = " + order2.getDesc());
    }
}
