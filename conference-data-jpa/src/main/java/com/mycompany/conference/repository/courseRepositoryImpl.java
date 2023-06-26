package com.mycompany.conference.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mycompany.conference.model.Course;

@Repository
public class courseRepositoryImpl implements CourseRepository {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public Course save(Course course){
		 entitymanager.persist(course);
		 return course;
		
	}

}
