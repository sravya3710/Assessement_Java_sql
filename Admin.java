package com.org.genAss;
import org.springframework.stereotype.Component;

@Component


public class Admin implements Employee {
	
	public Admin() {
		System.out.println("Admin department is checking required document of customers");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	
}