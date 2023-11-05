package com.iuh.fit.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Helloworld hel = context.getBean("helloWorld", Helloworld.class);
//		hel.getMessage();
//		Student std = context.getBean("s1", Student.class);
//		std.show();
		Employee e = context.getBean("e", Employee.class);
		// (Employee) factory.getBean("e");
		e.show();
	}
}
