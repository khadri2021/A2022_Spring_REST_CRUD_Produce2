package com.khadri.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Student;

@RestController
public class ProducerStudentController {

	private static Student std = new Student();

	@PostMapping("/register/add")
	public String registerStudent(Integer id, String name,String add) {
		std.setId(id);
		std.setName(name);
		std.setAddress(add);

		return id + " Student Added";
	}

	@GetMapping(value = "/register/view")
	public Student readAllRegisteredStudents() {
		System.out.println("Invoked readAllRegisteredStudents()");
		return std;
	}

}
