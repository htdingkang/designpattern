package com.atguigu.designpattern.mediator;

public class Client {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		
		//创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//创建了CoffeeMachine 对象，并且加入到  ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		
		//创建 Curtains , 并且加入到  ConcreteMediator 对象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");

		//创建 tV , 并且加入到  ConcreteMediator 对象的HashMap
		TV tV = new TV(mediator, "TV");
		
		//让闹钟发出消息
		alarm.sendAlarm(1);
		tV.sendMessage(0);
		alarm.sendAlarm(0);
	}

}
