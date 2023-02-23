package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Welcome {
	@GetMapping("/c")
	public String Wecome() {
		return "welcome";
	}
}