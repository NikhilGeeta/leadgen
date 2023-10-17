package com.StudentsLeadsDevelopment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentsLeadsDevelopment.Entity.StudentsEntity;
import com.StudentsLeadsDevelopment.Repo.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;

	// http://localhost:8080/getAllData
	@RequestMapping("/getAllData")
	public List<StudentsEntity> GetAllData() {
		List<StudentsEntity> all = studentRepo.findAll();
		return all ;
	}
}
