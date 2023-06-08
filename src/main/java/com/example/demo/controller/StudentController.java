package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@RestController
@RequestMapping(value = "std")
public class StudentController {

	@Autowired
	private StudentRepo repo;

	@PostMapping
	public ResponseEntity<Student> savestd(@RequestBody Student std) {
		Student s = repo.save(std);
		System.out.println(s);
		return ResponseEntity.ok(s);
	}

}
