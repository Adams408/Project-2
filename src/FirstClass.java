
/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * FirstClass.java
 */

public class FirstClass extends Ticket {

    private int seatNumber;

    public FirstClass() {
    }

    public FirstClass(String name, String startingCity, String destinationCity, String classSelected, int flightNumber, int departureDate, int departureTime, int seatNumber) {
        super(name, startingCity, destinationCity, classSelected, flightNumber, departureDate, departureTime);
        this.seatNumber = seatNumber;
    }
}
