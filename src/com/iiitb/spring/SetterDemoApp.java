package com.iiitb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setter Depedency Injection
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach=context.getBean("myCoach1",CricketCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		context.close();
	}

}
