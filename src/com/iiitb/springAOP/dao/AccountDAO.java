package com.iiitb.springAOP.dao;

import org.springframework.stereotype.Component;

import com.iiitb.springAOPdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account)
	{
		System.out.println("Adding an account");
	}
	
	public int addBills()
	{
		System.out.println("Adding bills");
		return 0;
	}

}
