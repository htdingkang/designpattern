package com.atguigu.designpattern.mediator;

//�����ͬ����
public class Alarm extends Colleague {

	//������
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//�ڴ���Alarm ͬ�¶���ʱ�����Լ����뵽ConcreteMediator ������[����]
		mediator.register(name, this);
	}

	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}

	@Override
	public void sendMessage(int stateChange) {
		//���õ��н��߶����getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

}
