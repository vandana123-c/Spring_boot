package com.mycompany.conference.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mycompany.conference.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository  {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public User save(User user) {
		 entitymanager.persist(user);
		 return user;
	}

}
