package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@ComponentScan("com.example.demo")
public class conferenceConfig {
	
	public ViewResolver getresolver() {
		
		InternalResourceViewResolver bean =new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		bean.setOrder(0);
		return bean;
		
	}
	
	
	

}
