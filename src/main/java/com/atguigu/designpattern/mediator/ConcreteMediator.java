package com.atguigu.designpattern.mediator;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {
	//集合，放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	@Override
	public void register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);


		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

	//具体中介者的核心方法
	//1. 根据得到消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void getMessage(int stateChange, String colleagueName) {

		//处理闹钟发出的消息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).finishCoffee();
			} else if (stateChange == 1) {
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
			}
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			if (stateChange == 0) {

			} else if (stateChange == 1) {
				((Curtains) (colleagueMap.get(interMap.get("Curtains")))).downCurtains();
			}
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			if (stateChange == 0) {

			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
			}
		} else if (colleagueMap.get(colleagueName) instanceof TV) {
			if (stateChange == 0) {
				((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
			} else if (stateChange == 1) {

			}
		}

	}

}
