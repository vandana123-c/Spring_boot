package com.mycompany.conference.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.conference.model.Course;
import com.mycompany.conference.repository.courseRepositoryImpl;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	courseRepositoryImpl service;
	
	@Override
	public Course save(Course course) {
		return service.save(course);	
	}

}
