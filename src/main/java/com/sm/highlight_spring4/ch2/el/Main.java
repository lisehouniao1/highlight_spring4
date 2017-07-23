package com.sm.highlight_spring4.ch2.el;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		
		ElConfig resourceService = context.getBean(ElConfig.class);
		
		resourceService.outputResource();
		
		context.close();
	}
}
