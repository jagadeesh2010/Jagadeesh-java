package com.test.spring.aspects;

public @interface Aspect {

}

public class EmployeeXMLConfigAspect {
	public Object employeeAroundAdice(proceddingJoin joinPoint)
	{
		System.out.println("EmployexmlConfigAspec :: Before invoking getName() ");
		
		Object value = null;
		
		try
		{
			value = joinPoint.proceed();
	
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
	System.out.print("");
	}
}