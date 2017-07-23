package com.sm.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoProptotypeService p1 = context.getBean(DemoProptotypeService.class);
		DemoProptotypeService p2 = context.getBean(DemoProptotypeService.class);
	
		System.out.println("s1与s2::" + s1.equals(s2));
		System.out.println("p1与p2::" + p1.equals(p2));
		
		context.close();
	}
}
