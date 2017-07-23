package com.sm.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sm.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy	//开启spring对aspectj的支持
public class AopConfig {

}
