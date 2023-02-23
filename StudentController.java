package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Value("${value.name}")
	@GetMapping("/home")
	public String HomePage() {
		return "to student list";
	}
	@GetMapping("/list")
	public List<Student> getList() {
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"Yogesh",20));
		detailsList.add(new Student(2,"VJ",15));
		detailsList.add(new Student(3,"waran",10));
		
		return detailsList;
	}
}
