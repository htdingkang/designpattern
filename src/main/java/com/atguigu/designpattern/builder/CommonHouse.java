package com.atguigu.designpattern.builder;

/**
 * concrete builder
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基 5m");
        house.setBasic("5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙 10cm");
        house.setWall("10cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子结顶");
        house.setRoof("瓦片");
    }
}
