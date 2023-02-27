package streamassignment;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Driver {

    public static void main(String[] arg){
        List<Products> products=new ArrayList<>();
        products.add(new Products(1,"Mango", 121, Date.valueOf("2022-01-02"),Date.valueOf("2020-01-01")));
        products.add(new Products(2,"Apple", 122, Date.valueOf("2022-01-03"),Date.valueOf("2020-01-02")));
        products.add(new Products(3,"Pineapple", 123, Date.valueOf("2022-01-04"), Date.valueOf("2020-01-03")));
        products.add(new Products(4,"Guava", 124 ,Date.valueOf("2022-01-05"), Date.valueOf("2020-01-04")));
        products.add(new Products(5,"Papaya", 125, Date.valueOf("2022-01-06") , Date.valueOf("2020-01-05")));
        products.add(new Products(6,"Orange", 126, Date.valueOf("2022-11-11"),Date.valueOf("2022-11-11")));

//        System.out.println(products);


        System.out.println("All Product");
        Consumer displayName=o-> System.out.println(o);
        Consumer<Products> displayPrice=o->System.out.println(o.getProductName()+", Price: "+o.getProductPrice());
        Consumer<Products> displayExpiry=o->System.out.println(o.getProductName()+" "+o.getExpiryDate());
        Consumer<Products> displayManufacturing=o->System.out.println(o.getProductName()+" "+o.getManufacturingDate());
//        Consumer<Product> displayError=o->System.out.println(o.getProductName()+" "+o.getProductPrice());

        products.stream().map(e->e.getProductName()).forEach(displayName);

        System.out.println();

        int maxPrice=300;
        System.out.println("All product that have less price than " + maxPrice);
        products.stream().filter(e->e.getProductPrice()<=maxPrice).forEach(displayPrice);

        System.out.println();

        System.out.println("All product that have expiry this month");
        Date currentDate=new Date(System.currentTimeMillis());
        products.stream().filter(
                e->{
                    if(e.getExpiryDate().getYear()==currentDate.getYear() && e.getExpiryDate().getMonth() == currentDate.getMonth()){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
        ).forEach(displayExpiry);

        System.out.println();
        System.out.println("All 3 old product");
        products.stream().sorted(Comparator.comparing(Products::getManufacturingDate)).limit(3).forEach(displayManufacturing);


        System.out.println();
        System.out.println("All 3 new product");
        products.stream().sorted(Comparator.comparing(Products::getManufacturingDate).reversed()).limit(3).forEach(displayManufacturing);
    }
}