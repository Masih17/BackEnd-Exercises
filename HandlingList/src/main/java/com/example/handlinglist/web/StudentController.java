package com.example.handlinglist.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.handlinglist.domain.Student;


@Controller
public class StudentController {

	private List<Student> studentList = new ArrayList<Student>();
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greeting(@RequestParam(value = "firstName", required = false) String firstName,
						   @RequestParam(value = "lastName", required = false) String lastName, Student student, Model model) {
		
		studentList = new ArrayList<Student>(); 
		
		Student student1 = new Student("Kate", "Cole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		System.out.println(studentList);
		model.addAttribute("studentList", studentList);
		
		
		return "studentlist";
	}
}
