package com.springcore.p2;

public class Passenger {
    private String name;
    private String panCardNumber;
    private String contactNumber;
    private String passportNumber;

    public Passenger() {

    }

   

    public Passenger(String name, String panCardNumber, String contactNumber, String passportNumber) {
		super();
		this.name = name;
		this.panCardNumber = panCardNumber;
		this.contactNumber = contactNumber;
		this.passportNumber = passportNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPanCardNumber() {
		return panCardNumber;
	}



	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getPassportNumber() {
		return passportNumber;
	}



	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}



	public Integer size() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
