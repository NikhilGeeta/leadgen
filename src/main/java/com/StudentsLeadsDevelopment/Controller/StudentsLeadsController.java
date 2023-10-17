package com.StudentsLeadsDevelopment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsLeadsDevelopment.Entity.StudentsEntity;
import com.StudentsLeadsDevelopment.Service.StudentService;
import com.StudentsLeadsDevelopment.dto.Studentdto;
import com.StudentsLeadsDevelopment.util.EmailServices;

import java.util.*;

@Controller
public class StudentsLeadsController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmailServices emailServices;
	
	// http:/localhost:8080/showStudentsLeads
	@RequestMapping("/showStudentsLeads")
	public String ShowLeads() {
		return "StudentsLeads" ;
	}
	
	@RequestMapping("/saveLead")
	public String SaveLeads(StudentsEntity stu,Model model) {
		studentService.SaveLeads(stu);
		emailServices.Email(stu.getEmail(),"Student Lead ", "Student Lead Project Completed");
		model.addAttribute("msg","Student Lead Saved SuccessFully and mail send");
		return "StudentsLeads" ;
	}
	// http://localhost:8080/ListAllLeads
	
	@RequestMapping("/ListAllLeads")
	public String getAllLeads(Model model) {
		List<StudentsEntity> list =studentService.listAllLeads();
		model.addAttribute("lead",list);
		return "ListAllLeads" ;
	}
	
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id")long id,Model model) {
		studentService.Delete(id);
		List<StudentsEntity> list =studentService.listAllLeads();
		model.addAttribute("lead",list);
		return "ListAllLeads" ;
	}
	
	@RequestMapping("/update")
	public String UpdateLead(@RequestParam("id")long id,Model model) {
		StudentsEntity stu =studentService.findByID(id);
		model.addAttribute("lead",stu);
		return "UpdatedLead" ;
	}
	
	@RequestMapping("/saveLeadsUpdate")
	public String Update(Studentdto dto,Model model) {
		studentService.saveUpdate(dto);
		
		List<StudentsEntity> list =studentService.listAllLeads();
		model.addAttribute("lead",list);
		return "ListAllLeads" ;
	}
	
}
