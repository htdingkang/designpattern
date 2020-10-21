package com.atguigu.designpattern.mediator;

public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void upCurtains() {
		System.out.println("I am holding Up Curtains!");
		sendMessage(0);
	}

	public void downCurtains() {
		System.out.println("I am drop down Curtains!");
		sendMessage(1);
	}

}
