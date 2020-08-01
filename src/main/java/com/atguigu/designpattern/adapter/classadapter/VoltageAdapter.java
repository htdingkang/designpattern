package com.atguigu.designpattern.adapter.classadapter;

/**
 * 类适配器模式
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44 ;   //电压适配，得到目标电压
        return dst;
    }
}
