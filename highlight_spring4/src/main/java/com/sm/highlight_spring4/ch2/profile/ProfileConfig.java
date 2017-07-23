package com.sm.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean dvDemoBean() {
		return new DemoBean("from deveopment profile");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("from production profile");
	}
}
