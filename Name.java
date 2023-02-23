package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	private String studentName="MyName";
	@GetMapping("/a")
	public String getname() {
		return "Welcome"+studentName;
	}
}
