package com.atguigu.designpattern.state.money;

/**测试类*/
public class Client {

	public static void main(String[] args) {

		//创建context 对象
		Context context = new Context();

        //将当前状态设置为 订单生成
		context.setState(new GenerateState());
        context.printCurrentState();

        //电审通过
        context.checkEvent();

		//定价发布
		context.makePriceEvent();

		//接单
        context.acceptOrderEvent();

		//支付
        context.payOrderEvent();

        // 验证抛出异常
        try {
        	context.payOrderFailureEvent();
        	System.out.println("流程正常..");
		} catch (Exception e) {
			//todo  handle exception
			System.out.println(e.getMessage());
		}
        
	}

}
