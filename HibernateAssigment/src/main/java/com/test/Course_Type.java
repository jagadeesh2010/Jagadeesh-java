package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Couse_Details")
public class Course_Type {
	
	private int id;
	
	private String cou_name;
	
	private String cou_dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCou_name() {
		return cou_name;
	}

	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}

	public String getCou_dept() {
		return cou_dept;
	}

	public void setCou_dept(String cou_dept) {
		this.cou_dept = cou_dept;
	}
	

}
