package com.atguigu.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    //遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {

        //从collegeList 取出所有学院, Java 中的 List 已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            printDepartment(college);
        }
    }


    //输出 学院输出 系

    public void printDepartment(College college) {
        Iterator iterator = college.createIterator();
        while(iterator.hasNext()) {
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }

}
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
