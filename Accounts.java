package com.org.genAss;
import org.springframework.stereotype.Component;

@Component


public class Accounts implements Employee {
	
	public Accounts() {
		System.out.println("Accounts section is updated with all the account details");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

}
