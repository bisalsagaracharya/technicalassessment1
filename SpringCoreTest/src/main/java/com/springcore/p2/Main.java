//package org.problemstatement2;
package com.springcore.p2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configticket.xml");
        Ticket1 ticket1 = (Ticket1) applicationContext.getBean("ticket");
        System.out.println(ticket1);
        ticket1.displayTicketInformation();
    }
}