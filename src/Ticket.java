
/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Ticket.java
 */

public class Ticket {

    private String name, startingCity, destinationCity;
    private int flightNumber, departureDate, departureTime;

    public Ticket() {
        name = "";
        startingCity = "";
        destinationCity = "";
        flightNumber = 0;
        departureDate = 0;
        departureTime = 0;
    }

    public Ticket(String name, String startingCity, String destinationCity, int flightNumber, int departureDate, int departureTime) {
        this.name = name;
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(int departureDate) {
        this.departureDate = departureDate;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
}
