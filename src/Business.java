
/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Business.java
 */

public class Business extends Ticket {

    private int seatNumber;

    public Business() {
    }

    public Business(String name, String startingCity, String destinationCity, String classSelected, int flightNumber, int departureDate, int departureTime, int seatNumber) {
        super(name, startingCity, destinationCity, classSelected, flightNumber, departureDate, departureTime);
        this.seatNumber = seatNumber;
    }
}
