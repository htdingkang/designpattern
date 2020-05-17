package com.atguigu.designpattern.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

//使用静态内部类完成单例模式，推荐使用
//Singleton加载的时候其静态内部类SingletonInstance不会马上加载，保证了懒加载。
//当执行gteInstance()的时候会导致SingletonInstance的装载，而jvm底层在装载类的时候是线程安全的。

class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}