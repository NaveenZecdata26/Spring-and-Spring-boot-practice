package com.spring.core.SpringCore.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/com/spring/core/SpringCore/DI/configuration.xml");
		
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);

	}

	
}
