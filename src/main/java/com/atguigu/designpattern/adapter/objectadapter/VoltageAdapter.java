package com.atguigu.designpattern.adapter.objectadapter;


/**
 * 对象适配器模式
 */
public class VoltageAdapter implements IVoltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src / 44 ;   //电压适配，得到目标电压
        return dst;
    }
}
