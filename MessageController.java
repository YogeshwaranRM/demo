package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MessageController {
	 @GetMapping("/check")
	 public String checkApi() throws JsonProcessingException{
		Message response=new Message("Hello welcome to this page");
	    ObjectMapper obj=new ObjectMapper();
	    return obj.writeValueAsString(response);
	 }

}
