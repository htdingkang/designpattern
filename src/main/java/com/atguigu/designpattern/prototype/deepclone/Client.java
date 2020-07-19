package com.atguigu.designpattern.prototype.deepclone;

public class Client {
    public static void main(String[] args) {
        DeepProtoType d = new DeepProtoType("dd");
        d.setDeepCloneableTarget(new DeepCloneableTarget("kk", 27));
        try {
            DeepProtoType dd = d.clone();
            System.out.println("d = " + d.toString() + ",d.deepCloneableTarget=" + d.getDeepCloneableTarget().hashCode());
            System.out.println("dd=" + dd.toString() + ",dd.deepCloneableTarget=" + dd.getDeepCloneableTarget().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
