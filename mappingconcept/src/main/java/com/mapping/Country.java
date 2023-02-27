package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
    
	@Id
	private int countryId;
	
	private String countryName;
	
}
