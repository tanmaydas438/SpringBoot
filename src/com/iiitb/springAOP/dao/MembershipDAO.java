package com.iiitb.springAOP.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount()
	{
		System.out.println("Add account in membership class");
	}

}
