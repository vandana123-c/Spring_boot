package com.mycompany.service;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.model.Friend;

public interface FriendsService extends CrudRepository<Friend, Integer> {
	
	Iterable<Friend>findByFirstNameAndLastName(String firstName, String lastName);

	Iterable<Friend>findByFirstName(String firstName);
	Iterable<Friend>findByLastName(String lastName);
}
