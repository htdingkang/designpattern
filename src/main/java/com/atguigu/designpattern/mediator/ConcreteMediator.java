package com.atguigu.designpattern.mediator;

import java.util.HashMap;

//������н�����
public class ConcreteMediator extends Mediator {
	//���ϣ��������е�ͬ�¶���
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

	//�����н��ߵĺ��ķ���
	//1. ���ݵõ���Ϣ����ɶ�Ӧ����
	//2. �н��������������Э�����������ͬ�¶����������
	@Override
	public void getMessage(int stateChange, String colleagueName) {

		//�������ӷ�������Ϣ
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
