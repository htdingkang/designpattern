package com.atguigu.designpattern.bridge;

public class UprightPhone extends Phone{

    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.println("直立式手机开机");
        super.open();
    }

    public void close() {
        System.out.println("直立式手机关机");
        super.close();
    }

    public void call() {
        System.out.println("直立式手机打电话");
        super.call();
    }

}
