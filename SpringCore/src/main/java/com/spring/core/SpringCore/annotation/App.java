package com.spring.core.SpringCore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.SpringCore.annotation.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/com/spring/core/SpringCore/annotation/configuration.xml");
		
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);


	}

}
