package com.iiitb.springAOPdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iiitb.springAOP.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO ad=context.getBean("accountDAO",AccountDAO.class);
		ad.addAccount(new Account());
		context.close();

	}

}
