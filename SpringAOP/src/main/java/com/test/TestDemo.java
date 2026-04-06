package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

 public static void main(String[] args) {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext() {
		 EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);
		 
		 Syste

	 }
			 
 }
}
