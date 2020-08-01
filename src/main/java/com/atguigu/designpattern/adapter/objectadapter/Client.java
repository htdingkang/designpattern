package com.atguigu.designpattern.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        new Phone(new VoltageAdapter(new Voltage220V())).charge();
    }
}
