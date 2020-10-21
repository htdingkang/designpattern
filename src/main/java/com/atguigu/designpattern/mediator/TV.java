package com.atguigu.designpattern.mediator;

public class TV extends Colleague {

	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startTV() {
		System.out.println("It's time to StartTv!");
		sendMessage(1);
	}

	public void stopTV() {
		System.out.println("StopTv!");
		sendMessage(0);
	}
}
