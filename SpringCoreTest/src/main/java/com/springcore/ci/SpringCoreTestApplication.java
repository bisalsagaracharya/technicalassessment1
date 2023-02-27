package com.springcore.ci;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringCoreTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreTestApplication.class, args);
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("ciconfig.xml");
		Employee emp=(Employee) context1.getBean("employee");
		System.out.println(emp);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("ciconfig.xml");
		Employee emp2=(Employee) context2.getBean("employee1");
		System.out.println(emp2);
		
		ApplicationContext context3 = new AnnotationConfigApplicationContext(EmployeeList.class);
		EmployeeList emp3=(EmployeeList) context3.getBean("employeeList");
		//emp3.findAll().forEach(System.out::println);
		System.out.print(emp3.findAll());
		 
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		Ticket bean =context.getBean(Ticket.class);
//		
//		BusDetails busDetails = new BusDetails("E1", "2022-01-10", "10:00am", "11:00am", "Bangalore", "Hyderabad",
//				1200);
//		
//		List<Passenger> passengers = Arrays.asList(new Passenger("sameer", "EYJPM1234", "1234567891", "12345"),
//				
//				new Passenger("ameer", "EYJPM1234", "1234567891", "12345"));
//		
//		Ticket ticket = new Ticket(busDetails, 2, passengers);
//			
		}
		
	}


