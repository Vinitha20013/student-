package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Studentinfo;

import com.student.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("enter")
public class StudentController {
	@Autowired
	StudentService sv;
	@GetMapping("/get{rollNo}")
	public List<Studentinfo> getDetails(@PathVariable("rollNo") int rollNo){
		return sv.getDetails(rollNo);
		}
	@PostMapping("/save")
	public Studentinfo saveDetails(@RequestBody Studentinfo info) {
		return sv.saveDetails(info);
	
	}
	@DeleteMapping("/Delete{rollNo}")
	public String  delete(@PathVariable("rollNo") int rollNo) {
		sv.delete(rollNo);
		return "deleted";
		
		
	}
	
	}


