package com.springcore.coninject;

public class Address {
	 private int house_number;
	    private String street;
	    private String city;

	    public Address(int house_number, String street, String city) {
	        this.house_number = house_number;
	        this.street = street;
	        this.city = city;
	    }

		@Override
		public String toString() {
			return "Address [house_number=" + house_number + ", street=" + street + ", city=" + city + "]";
		}
	    
}
