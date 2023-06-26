package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.user;

@RestController
public class UserController {

	@GetMapping("/user")
	public user Getuser(@RequestParam (value="firstname", defaultValue="vandana") String firstname,
			@RequestParam (value="firstname", defaultValue="chilkuru") String lastname,
			@RequestParam (value="firstname", defaultValue="25") int age) {
		
		user user=new user();
		user.setAge(age);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		
		return user;
	}
	
	@PostMapping("/user")
	public user getuser(user user)
	{
		System.out.println("user firstname"+user.getFirstname());
		return user;
	}
	
	@ResponseBody
	@PostMapping("/user/XML")
	public user adduser(@RequestBody user user)
	{
		System.out.println("XML firstname"+user.getFirstname());
		return user;
	}
}
