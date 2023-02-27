package com.springcore.listinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("list.xml");
	Employee emp = (Employee) context.getBean("employee");
	System.out.println(emp);
//	Address address = emp.getAddress();
//	System.out.println(address);
}
}
