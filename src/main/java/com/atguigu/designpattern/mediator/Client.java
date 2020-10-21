package com.atguigu.designpattern.mediator;

public class Client {

	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();
		
		//����Alarm ���Ҽ��뵽  ConcreteMediator �����HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//������CoffeeMachine ���󣬲��Ҽ��뵽  ConcreteMediator �����HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		
		//���� Curtains , ���Ҽ��뵽  ConcreteMediator �����HashMap
		Curtains curtains = new Curtains(mediator, "curtains");

		//���� tV , ���Ҽ��뵽  ConcreteMediator �����HashMap
		TV tV = new TV(mediator, "TV");
		
		//�����ӷ�����Ϣ
		alarm.sendAlarm(1);
		tV.sendMessage(0);
		alarm.sendAlarm(0);
	}

}
