package com.springcore.autoinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Config2.xml");
		Employee emp = (Employee) context1.getBean("employee");
		System.out.println(emp);
//	Address address = emp.getAddress();
//	System.out.println(address);
	}
}
