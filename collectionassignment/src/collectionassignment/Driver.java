/*package collectionassignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		 //Create
		Map<Integer,Product> proMap=new HashMap<>();
		proMap.put(1,new Product(101,"HeroBike",20000.0));
		proMap.put(2,new Product(102,"HondaBike",30000.0));
		proMap.put(3,new Product(103,"SuzukiBike",40000.0));
		proMap.put(4,new Product(104,"KtmBike",50000.0));
		proMap.put(5,new Product(106,"KtmBike",50000.0));
		proMap.put(6,new Product(107,"KtmBike",50000.0));
		System.out.println(proMap);
		
		//Read
		
		System.out.println(proMap.get(1));
		System.out.println(proMap.get(4));
		
		//Update
		
		proMap.replace(3,new Product(105,"BulletBike",60000.0));
		System.out.println(proMap);
		
		//Delete
		
		proMap.remove(1);
		System.out.println(proMap);
		
	   Set<Product> proSet=new HashSet<Product>();
	   proSet.add(new Product(101,"bullet",100.0));
	   proSet.add(new Product(102,"ktm",200.0));
	   proSet.add(new Product(103,"hero",300.0));
	   proSet.add(new Product(104,"honda",400.0));
	   proSet.add(new Product(105,"maruti",500.0));
	   proSet.add(new Product(102,"suzuki",600.0));
	   proSet.add(new Product(103,"kia",700.0));
	   
	   SortedSet<Product> sortProduct=new TreeSet<Product>(proSet);
	   System.out.println(sortProduct);

	}

}*/
