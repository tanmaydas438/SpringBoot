package com.iiitb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		//creating Spring Container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		
		 //Constructor Depenedency Injection
		 Coach theCoach=context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
