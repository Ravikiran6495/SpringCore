package com.hefshine.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	// IOC(Inversion of control) 
	
	public static void main(String[] args) {
			
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) context.getBean("s");
		
		
		student.Study();
		student.display();
	
	}
}
