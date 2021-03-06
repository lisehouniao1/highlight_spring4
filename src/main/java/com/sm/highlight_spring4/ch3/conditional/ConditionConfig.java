package com.sm.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		return new WindowsListService();
	}
}
