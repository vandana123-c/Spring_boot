package com.mycompany.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.model.Friend;
import com.mycompany.service.FriendsService;

@Controller
public class friendcontroller {
	
	@Autowired
	FriendsService friendsService;

	@PostMapping("/friend")
	Friend create(@RequestBody Friend friend) {

		return friendsService.save(friend);
	}

	@GetMapping("/friend")
	Iterable<Friend> read() {

		return friendsService.findAll();
	}

	@PutMapping("/friend")
	Friend update(@RequestBody Friend friend) {

		return friendsService.save(friend);
	}

	@DeleteMapping("/friend/{id}")
	void delete(@PathVariable Integer id) {
		friendsService.deleteById(id);

	}
	
	@GetMapping("/friend/{id}")
	Optional<Friend> findById(@PathVariable Integer id) {

		return friendsService.findById(id);
	}
	
	@GetMapping("/friend/search")
	Iterable<Friend> findByquery(@RequestParam (value ="first" ,required = false)String firstName, @RequestParam (value ="last" ,required = false)String lastName) {

		
		if(firstName != null && lastName != null)
			
			return friendsService.findByfirstname(firstName);
			
		else if(firstName != null)
			return friendsService.findByfirstname(firstName);
		
		else if(lastName != null)
			return friendsService.findBylastname(lastName);
		else
			return friendsService.findAll();
	}


}
