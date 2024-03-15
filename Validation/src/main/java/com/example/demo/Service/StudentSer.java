package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.Student;

@Service
public class StudentSer {
	
	@Autowired
	StudentRepo stdRepo;
	public Student saveStude(Student std) {
		return stdRepo.save(std);
		
		
		
	}
	
	

}
