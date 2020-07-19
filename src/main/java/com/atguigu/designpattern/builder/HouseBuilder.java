package com.atguigu.designpattern.builder;

/**
 * 抽象的建造者  ->  Builder
 */
public abstract class HouseBuilder {
    //聚合产品
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    public House build(){
        return house;
    }

}
