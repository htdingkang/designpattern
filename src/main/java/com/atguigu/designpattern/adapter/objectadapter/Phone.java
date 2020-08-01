package com.atguigu.designpattern.adapter.objectadapter;

public class Phone {

    IVoltage5V iVoltage5V;

    public Phone(IVoltage5V iVoltage5V) {
        this.iVoltage5V = iVoltage5V;
    }

    public void charge(){
        int i = iVoltage5V.output5V();
        if(i == 5){
            System.out.println("电压吻合，开始充电！");
        }
    }
}
