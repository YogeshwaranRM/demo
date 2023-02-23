package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String Favcolour="Green";
	@GetMapping("/b")
	public String getMyFav() {
		return "My favourite colour is "+Favcolour;
	}
}
