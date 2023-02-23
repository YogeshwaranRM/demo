package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	@JsonProperty("id")
	private int rollno;
	@JsonIgnore
	private String name;
	private int r;
	public Student(int rollno, String name,int r) {
		super();
		
		this.rollno = rollno;
		this.name =name;
		this.r = r;
	}
	public Student() {
		super();
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getR(){
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
}
