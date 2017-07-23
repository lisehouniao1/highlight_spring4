package com.sm.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	//在构造函数执行完之后执行
	@PostConstruct
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService() {
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	//在Bean销毁之前执行
	@PreDestroy
	public void destory() {
		System.out.println("jsr250-destory-method");
	}
}
