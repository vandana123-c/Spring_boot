package com.mycompany.conference.model;

public class RegistrationReport {
	
	String name;
	String coursedescription;
	String coursename;
	public RegistrationReport(String name, String coursedescription, String coursename) {
		super();
		this.name = name;
		this.coursedescription = coursedescription;
		this.coursename = coursename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	

}
