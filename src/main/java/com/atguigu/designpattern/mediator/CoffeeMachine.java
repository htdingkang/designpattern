package com.atguigu.designpattern.mediator;

public class CoffeeMachine extends Colleague {

	public CoffeeMachine(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startCoffee() {
		System.out.println("It's time to start coffee!");
		sendMessage(1);
	}

	public void finishCoffee() {
		System.out.println("Coffee is ok!");
	}
}
