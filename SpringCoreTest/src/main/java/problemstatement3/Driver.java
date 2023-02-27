package problemstatement3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configinvoice.xml");
        Invoice invoice1 = (Invoice) applicationContext.getBean("invoice1");
        Invoice invoice2 = (Invoice) applicationContext.getBean("invoice2");

        List<Invoice> invoiceList = new ArrayList<Invoice>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);

        for(Invoice invoice : invoiceList){
            System.out.println("******************************************************************************");
            System.out.println(invoice);
 
        }
    }
}
