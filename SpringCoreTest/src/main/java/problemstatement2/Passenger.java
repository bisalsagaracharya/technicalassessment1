package problemstatement2;

public class Passenger {
    private String name;
    private String panCard;
    private String cardNumber;
    private String passportNumber;

    public Passenger(String name, String panCard, String cardNumber, String passportNumber) {
        this.name = name;
        this.panCard = panCard;
        this.cardNumber = cardNumber;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", panCard='" + panCard + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

}
