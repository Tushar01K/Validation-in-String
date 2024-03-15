package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentSer;
import com.example.demo.entity.Student;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
@Autowired
StudentSer stdser;
	
@PostMapping("save")
	public Student savestd(@Valid @RequestBody Student std) {
		return stdser.saveStude(std);
		
		
		
	}

}
