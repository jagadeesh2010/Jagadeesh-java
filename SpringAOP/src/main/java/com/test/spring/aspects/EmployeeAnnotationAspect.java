package com.test.spring.aspects;

public class EmployeeAnnotationAspect {

	@Aspect
	public void logginAdvice();
	@Before("getNamePOint Cut");
	public void loggingAdvice()
	{
		System.out.println("execution logging advice on getName");
		
	}
}
