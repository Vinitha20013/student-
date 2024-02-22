package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Studentinfo;
import com.student.repository.StudentDAO;

@Service
public class StudentService {
	@Autowired
	StudentDAO studentdao;
	
	public List<Studentinfo> getDetails(int rollNo){
		return (List<Studentinfo>) studentdao.findAll();
		
		
		
		
	}
	public Studentinfo saveDetails(Studentinfo info) {
		return studentdao.save(info);
		
	}
	public void delete(int rollNo) {
		studentdao.deleteById(rollNo);
	}
	
 
}
