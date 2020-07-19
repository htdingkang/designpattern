package com.atguigu.designpattern.builder;

/**
 * 指挥者   -> Director
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造注入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //setter注入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何建造房子的流程，交给指挥者
    public House construct(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.build();
    }

}
