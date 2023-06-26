package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class conferenceConfig implements WebMvcConfigurer{
	
	@Bean
	public ViewResolver getresolver() {
		InternalResourceViewResolver bean =new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		bean.setOrder(0);
		return bean;
		
	}

@Override
public void addResourceHandlers(ResourceHandlerRegistry register) {
		register.addResourceHandler("/files/**")
		.addResourceLocations("/WEB-INF/pdf/");
		
		
		
	}
	
	
	

}
