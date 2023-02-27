package com.springcore.p2;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Drive {
	  public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Ticket1.class);
	       // context.refresh();
	        //context.registerBean(Ticket.class);
	        //Ticket bean = context.getBean(Ticket.class);

	        BusDetails busDetails = new BusDetails("101", "01-01-2020", "10:30", "11:00", "amroha", "moradabad", "100");

	        List<Passenger> passengers = Arrays.asList(new Passenger("p1", "pan1", "contact1", "passportN1"), new Passenger("p2", "pan2", "contact2", "passportN2"));

	        Ticket1 ticket = new Ticket1(busDetails, 10, passengers, Long.valueOf(Integer.valueOf(busDetails.getRateOfTicket()) * passengers.size()));

            //System.out.println(ticket.toString());
	        ticket.displayTicketInformation();
	    }
	  }

