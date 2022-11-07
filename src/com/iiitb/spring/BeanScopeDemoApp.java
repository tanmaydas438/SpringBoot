package com.iiitb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean_scope_applicationContext.xml");
		Coach c=context.getBean("myCoach",Coach.class);
		Coach d=context.getBean("myCoach",Coach.class);
		if(c==d)
			System.out.println("Yes");
		else
		System.out.println("No");
	}

}
