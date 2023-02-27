package com.springcore.p2;

import java.util.List;
public class Ticket1 {

    private BusDetails busDetails;
    private long NoOfSeats;
    private List<Passenger> passengers;

    private long totalAmount;

    public Ticket1() {
    }

    public Ticket1(BusDetails busDetails, long NoOfSeats, List<Passenger> passengers, long totalAmount) {
        this.busDetails = busDetails;
        this.NoOfSeats = NoOfSeats;
        this.passengers = passengers;
        this.totalAmount = totalAmount;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "busDetails=" + busDetails +
                ", NoOfSeats=" + NoOfSeats +
                ", passengers=" + passengers +
                ", totalAmount=" + totalAmount +
                '}';
    }
    
   
    public void selectBus(List<BusDetails> buses, String from, String to) {
        for (BusDetails bus : buses) {
            if (bus.getFrom().equalsIgnoreCase(from) && bus.getTo().equalsIgnoreCase(to)) {
                this.busDetails = bus;
                break;
            }
        }
    }

    
    public long calculateTotalAmount(int passengersSize, int ticketPrice) {
        return ticketPrice * passengersSize;
    }

 
    public void displayTicketInformation() {

        System.out.println("Ticket Information:");
        System.out.println("Bus ID: " + this.busDetails.getBusId());
        System.out.println("Date of Arrival: " + this.busDetails.getDateOfArrival());
        System.out.println("Arrival Time: " + this.busDetails.getArrivalTime());
        System.out.println("Departure Time: " + this.busDetails.getDepartureTime());
        System.out.println("From: " + this.busDetails.getFrom());
        System.out.println("To: " + this.busDetails.getTo());

        System.out.println("No of Seats: " + this.NoOfSeats);
        System.out.print("Passengers: ");
        for (Passenger passenger : this.passengers) {
            System.out.print(passenger.getName() + " ");
        }
        System.out.println();
        System.out.println("Total Amount: " + this.totalAmount);
    }

}
