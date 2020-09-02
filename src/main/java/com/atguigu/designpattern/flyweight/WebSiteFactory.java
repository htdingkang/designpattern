package com.atguigu.designpattern.flyweight;

import java.util.HashMap;

// 网站的工厂类，根据需求返回具体的网站
public class WebSiteFactory {

	
	//集合，充当池的作用
	private HashMap<String, WebSite> pool = new HashMap<>();
	
	//根据发布形式获取到对应的网站，如果没有就创建一个放入池中
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		
		return pool.get(type);
	}
	
	//获取网站发布形式的总数
	public int getWebSiteCount() {
		return pool.size();
	}
}
