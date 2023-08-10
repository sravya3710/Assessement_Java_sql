package com.org.genAss;

import org.springframework.stereotype.Component;

@Component

public class Manager implements Employee {
	Accounts ac;
	Cashier c;
	Admin a;
	Securities s;
	 
	public Manager(Accounts ac, Cashier c, Admin a,Securities s) {
		this.s=s;
		this.ac = ac;
		this.c = c;
		this.a = a;
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	public void callMeeting() {
		System.out.println("Manager Representing details");
		
		ac.work();
		c.work();
		s.work();
		a.work();
	}


	

}
