package com.atguigu.designpattern.state.money;

//环境上下文
public class Context {
	//当前的状态 state, 根据我们的业务流程处理，不停的变化
	private State state;


    public void checkEvent() {
        state.checkEvent(this);
        printCurrentState();
    }


    public void checkFailEvent() {
        state.checkFailEvent(this);
        printCurrentState();
    }


    public void makePriceEvent() {
        state.makePriceEvent(this);
        printCurrentState();
    }


    public void acceptOrderEvent() {
        state.acceptOrderEvent(this);
        printCurrentState();
    }


    public void notPeopleAcceptEvent() {
        state.notPeopleAcceptEvent(this);
        printCurrentState();
    }


    public void payOrderEvent() {
        state.payOrderEvent(this);
        printCurrentState();
    }


    public void payOrderFailureEvent() {
        state.payOrderFailureEvent(this);
        printCurrentState();
    }


    public void feedBackEvent() {
        state.feedBackEvent(this);
        printCurrentState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void printCurrentState() {
        System.out.println("当前状态 : " + state.getCurrentState());
    }
}
