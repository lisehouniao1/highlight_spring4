package com.sm.highlight_spring4.ch2.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.sm.highlight_spring4.ch2.el")
@PropertySource("classpath:com/sm/highlight_spring4/ch2/el/test.properties")
public class ElConfig {
	
	//注入普通字符串
	@Value("I Love You!")
	private String normal;
	
	//注入操作系统属性
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	//注入表达式结果
	@Value("#{ T(java.lang.Math) .random() * 100.0 }")
	private double randomNumber;
	
	//注入其他bean的属性
	@Value("#{demoService.another}")
	private String fromAnothor;
	
	//注入文件资源
	@Value("classpath:com/sm/highlight_spring4/ch2/el/test.txt")
	private Resource testFile;
	
	//注入网址资源
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	//注入配置文件
	@Value("${book.name}")
	private String bookName;
	
	//注入配置文件也可使用environment获得
	@Autowired
	private Environment environment;
	
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() throws IOException {
		System.out.println(normal);
		System.out.println(osName);
		System.out.println(randomNumber);
		System.out.println(fromAnothor);
		
		System.out.println(IOUtils.toString(testFile.getInputStream()));
		System.out.println(IOUtils.toString(testUrl.getInputStream()));
		System.out.println(bookName);
		System.out.println(environment.getProperty("book.author"));
	}
}
