package com.mycompany;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.service.*;

import org.springframework.context.ApplicationContext;



public class Application {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(appconfig.class);
		SpreakerService serv=context.getBean("SpeakerService",SpreakerService.class);
		
		

		System.out.println(serv);
		//SpreakerService serv2=context.getBean("SpeakerService",SpreakerService.class);
		//System.out.println(serv2);
		System.out.println(serv.findAll().get(0).firstname);
		System.out.println(serv.findAll().get(0).getSeednum());
			
		

	}

}
