package com.iiitb.springAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class CloudAspect {
	
	@Before("execution(* com.iiitb.springAOP.dao.*.*(..))")
	public void beforeAddAccount()
	{
		System.out.println(" Cloud Aspect before addAccount");
	}

}
