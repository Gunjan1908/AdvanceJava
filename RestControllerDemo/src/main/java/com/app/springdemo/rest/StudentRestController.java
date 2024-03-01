package com.app.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> theStudents = new ArrayList<Student>();
		theStudents.add(new Student("rahul","pawar"));
		theStudents.add(new Student("aishwarya","patil"));
		theStudents.add(new Student("xyz","pqr"));
		
		return theStudents;
	}

}


//GET -   http://localhost:8080/RestControllerDemo/api/students

/*[
 {
     "firstName": "rahul",
     "lastName": "pawar"
 },
 {
     "firstName": "aishwarya",
     "lastName": "patil"
 },
 {
     "firstName": "xyz",
     "lastName": "pqr"
 }
]*/




	


