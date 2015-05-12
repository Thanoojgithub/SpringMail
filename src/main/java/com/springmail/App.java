package com.springmail;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class)) {
			SpringMailImpl springMailImpl = (SpringMailImpl) context.getBean("springMailImpl");
			springMailImpl.sendMail("javadevelopertemple@gmail.com", "Test Mail", "Test Mail Body");
		}
	}
}
