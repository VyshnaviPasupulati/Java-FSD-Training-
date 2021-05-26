package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Teacher;
import com.ibm.repo.TeacherRepository;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherRepository trepo;
	
	@PostMapping(value= "/add", consumes="application/json")
	public String addTeacher(@RequestBody Teacher teach) {
		 trepo.save(teach);
		return "Teacher Added with id ";
	}
	
	@GetMapping(value= "/list", produces="application/json")
	public List<Teacher> list() {
	  return	trepo.findAll();
	}
	
	@GetMapping(value= "/find/{teid}", produces="application/json")
	public Teacher find(@PathVariable int teid) {
		//Teacher t = trepo.findById(teid).get();
		return trepo.findById(teid).get();
	}
	

}
