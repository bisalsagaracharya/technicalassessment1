package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Product product1=new Product("mobile",500);
        Product product2=new Product("laptop",1000);

        Offer offer1=new Offer("10%","10/01/2023","16/03/2023");
        Offer offer2=new Offer("15%","15/01/2023","20/03/2023");

        Map<Product,Offer> productMap=new HashMap<Product,Offer>();

        productMap.put(product1,offer1);
        productMap.put(product2,offer2);

        System.out.println(productMap);

    }
}