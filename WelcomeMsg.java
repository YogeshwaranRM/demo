package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeMsg {
	@GetMapping("/ab")
	public String msg() {
		return "welcome messsage";
	}
}