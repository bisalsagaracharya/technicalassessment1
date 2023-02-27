package problemstatement2;

import java.util.List;

public class Ticket {
    private BusDetails busDetails;
    private int numberOfSeats;
    private List<Passenger> passengers;
    private double amount;

    public Ticket(BusDetails busDetails, int numberOfSeats, List<Passenger> passengers) {
        this.busDetails = busDetails;
        this.numberOfSeats = numberOfSeats;
        this.passengers = passengers;
    }

    public BusDetails getBusDetails() {
        return busDetails;
    }

    public void setBusDetails(BusDetails busDetails) {
        this.busDetails = busDetails;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

 
    public void displayTicketInformation() {
    	
        double totalTicketPrice = this.getBusDetails().getPrice() * this.numberOfSeats;
        this.setAmount(totalTicketPrice);
        System.out.println("Ticket Details :");
        System.out.println("From : " +this.getBusDetails().getFrom());
        System.out.println("To : "+this.getBusDetails().getTo());
        System.out.println("Departure Time  : "+this.getBusDetails().getDepartureTime());
        System.out.println("Arrival Time : "+this.getBusDetails().getArrivalTime());
        System.out.println("List of passengers : "+this.getPassengers());
        System.out.println("Total Amount : Rs."+totalTicketPrice);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "busDetails=" + busDetails +
                ", numberOfSeats=" + numberOfSeats +
                ", passengers=" + passengers +
                ", amount=" + amount +
                '}';
    }
}
