package com.atguigu.designpattern.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        new Phone(new VoltageAdapter()).charge();
    }
}
