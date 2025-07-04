package com.spring.core.SpringCore.annotationbaseconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
