package com.glo.addressBook;

import java.util.regex.Pattern;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
		if(Pattern.matches("[a-zA-Z ]+", label) && label.length()<=255 && label!="")
			this.label = label;
		else
			throw new Exception();
		this.address=address;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
