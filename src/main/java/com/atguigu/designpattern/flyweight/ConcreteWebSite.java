package com.atguigu.designpattern.flyweight;

/**
 * 具体的网站类
 */
public class ConcreteWebSite extends WebSite {

	//网站的发布形式（新闻，博客，公众号。。。）
	//共享的部分，内部状态
	private String type = "";



	public ConcreteWebSite(String type) {
		this.type = type;
	}


	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为:" + type + " 正在使用中.. 使用者为：" + user.getName());
	}
	
	
}
