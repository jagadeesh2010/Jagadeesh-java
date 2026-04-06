package com.test.entity;

public class Student {

	private int id;
	
	private String std_name;
	
	private String std_college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_college() {
		return std_college;
	}

	public void setStd_college(String std_college) {
		this.std_college = std_college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", std_name=" + std_name + ", std_college=" + std_college + "]";
	}

	public Student(int id, String std_name, String std_college) {
		
		this.id = id;
		this.std_name = std_name;
		this.std_college = std_college;
	}
	
	
}

