package com.atguigu.designpattern.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construct();
        System.out.println(house);
        houseDirector.setHouseBuilder(new HighBuilding());
        House building = houseDirector.construct();
        System.out.println(building);
    }
}
