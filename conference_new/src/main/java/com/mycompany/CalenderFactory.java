package com.mycompany;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalenderFactory implements FactoryBean<Calendar> {
	
	private Calendar instance=Calendar.getInstance();

	@Override
	public  Calendar getObject() throws Exception {
		// TODO Auto-generated method stub
		return instance;
	}

	@Override
	public Class<Calendar> getObjectType() {
		// TODO Auto-generated method stub
		return Calendar.class;
	}

	public void adddays(int num) {
		
		instance.add(Calendar.DAY_OF_YEAR, num);
		
	}

}
