package com.atguigu.designpattern.builder;

/**
 * concrete builder
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基 100m");
        house.setBasic("100m");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙 20cm");
        house.setWall("20cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼房子结顶");
        house.setRoof("玻璃");
    }
}
