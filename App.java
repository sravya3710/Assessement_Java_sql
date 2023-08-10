package com.org.genAss;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Manager m=context.getBean(Manager.class);
		m.callMeeting();
		m.work();

	}

}
