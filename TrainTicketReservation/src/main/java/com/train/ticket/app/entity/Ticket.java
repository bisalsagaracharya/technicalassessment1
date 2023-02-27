package com.train.ticket.app.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ticket")
public class Ticket {
	
	private int counter = 100;
	private String pnr;
	private Date travelDate;
	private Train trainNo;
	private Integer qty;
	private List<Passenger> passenger;
	
	@Id
	private String generatePNR;
	 

	public Ticket() {
		super();
		 
	}

	public Ticket(String id,int counter, String pnr, Date travelDate, Train trainNo,Integer qty, List<Passenger> passenger,
			String generatePNR) {
		super();
		 
		this.counter = counter;
		this.pnr = pnr;
		this.travelDate = travelDate;
		this.trainNo = trainNo;
		
		this.passenger = passenger;
		this.generatePNR = generatePNR;
	}
	

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrainNo() {
		return trainNo;
	}

	public void setTrain(Train trainNo) {
		this.trainNo = trainNo;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public String getGeneratePNR() {
		return generatePNR;
	}

	public void setGeneratePNR(String generatePNR) {
		this.generatePNR = generatePNR;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	

}
