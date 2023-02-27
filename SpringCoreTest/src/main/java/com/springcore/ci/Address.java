package com.springcore.ci;

public class Address {

    private long houseNo;
    private String street;
    private String city;

    public Address() {
    }

    public Address(long houseNo, String street, String city) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
    }

   

    public long getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(long houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return 
                "{houseNo=" + houseNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
