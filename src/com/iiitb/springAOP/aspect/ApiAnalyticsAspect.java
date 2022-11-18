package com.iiitb.springAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class ApiAnalyticsAspect {
	
	@Before("execution(* com.iiitb.springAOP.dao.*.*(..))")
	public void beforeAddAccount()
	{
		System.out.println(" API Aspect before addAccount");
	}

}
