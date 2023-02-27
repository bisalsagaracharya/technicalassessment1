package problemstatement2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configticket.xml");
        Ticket ticket = (Ticket) applicationContext.getBean("ticket");
        System.out.println(ticket);
        ticket.displayTicketInformation();
    }
}