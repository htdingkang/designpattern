package com.atguigu.designpattern.proxy.dynamic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建目标对象
		ITeacherDao target = new TeacherDao();

		//给目标对象，创建代理对象, 可以转成 ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();


		//通过代理对象，调用目标对象的方法
		proxyInstance.teach();
		proxyInstance.sayHello(" tom ");

		//这里可以通过运行结果证明proxyInstance是Proxy的一个实例，这个实例实现了Subject接口
		System.out.print("proxyInstance instanceof Proxy: ");
		System.out.println(proxyInstance instanceof Proxy);

		//这里可以看出proxyInstance的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了ITeacherDao接口
		System.out.println("proxyInstance的Class类是：" + proxyInstance.getClass().toString());

		System.out.print("proxyInstance中的属性有：");

		Field[] field = proxyInstance.getClass().getDeclaredFields();
		for (Field f : field) {
			System.out.print(f.getName() + ", ");
		}

		System.out.print("\n" + "proxyInstance中的方法有：");

		Method[] method = proxyInstance.getClass().getDeclaredMethods();

		for (Method m : method) {
			System.out.print(m.getName() + ", ");
		}

		System.out.println("\n" + "proxyInstance的父类是：" + proxyInstance.getClass().getSuperclass());

		System.out.print("\n" + "proxyInstance实现的接口是：");

		Class<?>[] interfaces = proxyInstance.getClass().getInterfaces();

		for (Class<?> i : interfaces) {
			System.out.print(i.getName() + ", ");
		}

	}

}
