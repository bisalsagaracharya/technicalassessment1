package com.springcore.p2;

public class BusDetails {
	
    private String busId;
    private String dateOfArrival;
    private String arrivalTime;
    private String departureTime;
    private String from;
    private String to;
    private String rateOfTicket;

    public BusDetails() {
    }

    public BusDetails(String busId, String dateOfArrival, String arrivalTime, String departureTime, String from, String to, String rateOfTicket) {
        this.busId = busId;
        this.dateOfArrival = dateOfArrival;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.from = from;
        this.to = to;
        this.rateOfTicket = rateOfTicket;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrival_Time(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
       this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRateOfTicket() {
        return rateOfTicket;
    }

    public void setRateOfTicket(String rateOfTicket) {
        this.rateOfTicket = rateOfTicket;
    }
}
