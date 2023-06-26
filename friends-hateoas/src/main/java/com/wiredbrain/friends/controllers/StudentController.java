package com.wiredbrain.friends.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wiredbrain.friends.services.StudentService;
import com.wiredbrain.friends.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService StudentService;

	@PostMapping("/Student")
	Student create(@RequestBody Student Student) {

		return StudentService.save(Student);

	}

	@GetMapping("/Student")
	Iterable<Student> read() {
		return StudentService.findAll();
	}

	@PutMapping("/Student")
	Student update(@RequestBody Student Student) {

		return StudentService.save(Student);

	}

	@DeleteMapping("/Student/{id}")
	void delete(@PathVariable Integer id) {
		StudentService.deleteById(id);
	}

}
