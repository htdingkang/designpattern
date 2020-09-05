package com.atguigu.designpattern.proxy.cglib;

public class Client {


	public static void main(String[] args) {
		//创建目标对象
		TeacherDao target = new TeacherDao();
		//获取到代理对象，并且将目标对象传递给代理对象
		ProxyFactory facroty = new ProxyFactory(target);
		TeacherDao proxyInstance = (TeacherDao)facroty.getProxyInstance();

		//执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
		//final方法不会被代理
		String res = proxyInstance.teach();
		proxyInstance.finalTeach();


		//对特定方法拦截，添加不同的拦截器
		TeacherDao proxyInstance2 = (TeacherDao) facroty.getProxyInstance2();
		System.out.println(proxyInstance2.toString());
		proxyInstance2.teach();
		System.out.println(proxyInstance2.hashCode());
	}
}
