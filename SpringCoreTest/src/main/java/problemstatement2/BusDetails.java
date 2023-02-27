package problemstatement2;

public class BusDetails {
    private int busId;
    private String dateOfArrival;
    private String arrivalTime;
    private String departureTime;
    private String from;
    private String to;
    private double price;

    public BusDetails(int busId, String dateOfArrival, String arrivalTime, String departureTime, String from, String to, double price) {
        this.busId = busId;
        this.dateOfArrival = dateOfArrival;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
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

    public void setArrivalTime(String arrivalTime) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BusDetails{" +
                "busId=" + busId +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                '}';
    }
}
