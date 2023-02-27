package com.springcore.listinject;

import java.util.List;
import java.util.Set;

public class Address {
	    private int house_number;
	    private List<String> street;
	    private Set<String> city;
	    
		public Address(int house_number, List<String> street, Set<String> city) {
			super();
			this.house_number = house_number;
			this.street = street;
			this.city = city;
		}
		
		@Override
		public String toString() {
			return "Address [house_number=" + house_number + ", street=" + street + ", city=" + city + "]";
		}
	    
	   
	    
}
