package com.atguigu.designpattern.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
        Sheep sheep2 = sheep.clone();
        System.out.println(sheep.toString() + sheep.getFriend().hashCode());
        System.out.println(sheep2.toString() + sheep2.getFriend().hashCode());
    }
}
