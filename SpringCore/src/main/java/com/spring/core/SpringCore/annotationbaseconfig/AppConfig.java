package com.spring.core.SpringCore.annotationbaseconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	Student getStudent() {
		return new Student("naveen", "naveen@gmail.com", "987654323", getAddress());
	}

	@Bean
	Address getAddress() {
		return new Address("indore", "668", "...nagar");
	}

}
