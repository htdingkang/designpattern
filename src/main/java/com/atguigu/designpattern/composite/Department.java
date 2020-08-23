package com.atguigu.designpattern.composite;

public class Department extends OrganizationComponent {

	//没有集合

	public Department(String name, String des) {
		super(name, des);
	}


	//add , remove 就不用写了，因为他是叶子节点


	@Override
	protected void print() {
		System.out.println(getName());
	}

}
