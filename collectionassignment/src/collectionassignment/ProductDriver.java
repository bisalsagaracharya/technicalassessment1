package collectionassignment;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public  class ProductDriver{

	public static void main(String[] args) {
		 
		//C-Create
				System.out.println("Create operation");
				Map<Integer, Product> productMap = new HashMap<>();
				productMap.put(1, new Product(34, "Himalaya oil", 99.00));
				productMap.put(2, new Product(45, "Wow shampoo", 399.00));
				productMap.put(3, new Product(12, "Elibliss facewash", 299.00));
				productMap.put(4, new Product(25, "hair serum", 349.00));
				for(Map.Entry<Integer, Product> entry : productMap.entrySet())
					System.out.println(entry.getKey() +" : "+entry.getValue());
				
				//R-read
				System.out.println("\nRead operation");
				System.out.println("Product 1 : "+productMap.get(1));
				System.out.println("Product 1 : "+productMap.get(4));
				
				//U-Update
				System.out.println("\nUpdate operation");
				productMap.replace(2,new Product(36, "Dettol handwash", 149.00));
				for(Map.Entry<Integer, Product> entry : productMap.entrySet())
					System.out.println(entry.getKey() +" : "+entry.getValue());
				
				//D-delete
				System.out.println("\nDelete operation");
				productMap.remove(1);
				for(Map.Entry<Integer, Product> entry : productMap.entrySet())
					System.out.println(entry.getKey() +" : "+entry.getValue());
						
				
				//Convert Map values to Set
		        Set<Product> ProductSet= new HashSet<>(productMap.values());
		        System.out.println("\nProducts set");
		        ProductSet.forEach(value-> System.out.println(value));
		        
		        
		        //Trying to add new product with existing productID
		        Product newProduct = new Product(25, "DEO", 239.00);
		        ProductSet.add(newProduct);
		        System.out.println("\nProducts set after adding the new product with existing productID");
		        ProductSet.forEach(value-> System.out.println(value));
		        
		        
		        //Converting set to list
		        List<Product> proList = new ArrayList<>(ProductSet);
		        System.out.println("\nProduct list");
		        proList.forEach(value-> System.out.println(value));
		        
		        //Sorting by productID using natural sorting
		         Collections.sort(proList);
				System.out.println("\nProduct list after sorting by ProductID");
		        proList.forEach(value-> System.out.println(value));
		        
		        //Sorting by ProductName
		      	proList.sort(new ProductNameComparator());
		      	System.out.println("\nProduct list after sorting by  ProductName");
		      	proList.forEach(value-> System.out.println(value));
		      	
		      	//Sorting by ProductPrice
		    	proList.sort(new ProductPriceComparator());
		      	System.out.println("\nProduct list after sorting by  ProductPrice");
		      	proList.forEach(value-> System.out.println(value));
				
	}
}


