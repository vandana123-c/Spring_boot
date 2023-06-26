package com.mycompany;

import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import com.mycompany.CalenderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mycompany.repository.HibernateSpeakerRepositoryImp;
import com.mycompany.repository.SpeakerRepository;
import com.mycompany.service.SpeakerServiceImpl;
import com.mycompany.service.SpreakerService;

@Configuration
@ComponentScan("com.mycompany")
public class appconfig {
	
	
	@Bean(name="cal")
	public CalenderFactory getfactory() {
	CalenderFactory  factory=new CalenderFactory();
	factory.adddays(2);
	return factory;
	}
	
	@Bean
	public Calendar setcalender() throws Exception {
			return getfactory().getObject();
		
	}
	
	
	
	
	//@Bean(name="SpeakerService1")	public SpreakerService getspeakerservice1() {
//		
//		SpeakerServiceImpl service=new SpeakerServiceImpl();	
//		//service.setRep(getspeakerRepository());
//		return  service;
//	}
//	
//	@Bean(name="SpeakerService")
//	//@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
//	//@Scope(value=BeanDefinition.SCOPE_SINGLETON)
//	@Scope("singleton")
//	public SpreakerService getspeakerservice() {
//		//SpeakerServiceImpl service=new SpeakerServiceImpl(getspeakerRepository());
//		SpeakerServiceImpl service=new SpeakerServiceImpl();
//		return service;
//		 
//	}
//	
//	
//	@Bean(name="speakerrepository")
//	public SpeakerRepository getspeakerRepository() {
//		return new HibernateSpeakerRepositoryImp();
//	}

}
