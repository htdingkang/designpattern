package com.atguigu.designpattern.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        instance.say();
    }
}

//枚举的方式实现单例模式
//推荐使用
enum Singleton {
    INSTANCE;

    public void say() {
        System.out.println("ok");
    }

}