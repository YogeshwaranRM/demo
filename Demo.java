package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/")
	public String handleMethod1() {
		return "Hello World";
	}
	@GetMapping("/login")
	public String handleMethod2() {
		return "Empty";
	}
}