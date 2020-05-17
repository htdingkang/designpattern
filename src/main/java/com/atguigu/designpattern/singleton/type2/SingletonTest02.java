package com.atguigu.designpattern.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);

        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance3 == instance4);

        Singleton3 instance5 = Singleton3.getInstance();
        Singleton3 instance6 = Singleton3.getInstance();
        System.out.println(instance5 == instance6);
    }
}

//懒汉式（线程不安全），单线程环境下能达到懒加载效果。
//实际开发中不能使用，多线程环境下不能保证单例效果。
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


//懒汉式（线程安全）
//方法同步，效率太低，每次getInstance()都要synchronized ，而实际情况是只需要执行一次synchronized就ok了
//不推荐使用
class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}


//同步代码块，双重检查机制
//适用于只需要走一次同步的场景，既线程安全，又高效率，推荐使用
class Singleton3 {
    private Singleton3() {
    }

    //volatile 将值的更新立即刷到主存
    private static volatile Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}