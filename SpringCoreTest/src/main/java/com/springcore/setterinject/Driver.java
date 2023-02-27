package com.springcore.setterinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Config.xml");
		Employee1 emp = (Employee1) context1.getBean("employee");
		System.out.println(emp);
//	Address address = emp.getAddress();
//	System.out.println(address);
	}
}
