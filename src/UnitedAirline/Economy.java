package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.Economy.java
 */

public class Economy {

    // VARIABLES

    private String name;
    private String startingCity;
    private String destinationCity;
    private int flightNumber;
    private String departureDate;
    private String departureTime;

    private double price = 300;

    public Economy(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        this.name = name;
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }

    public String reserveUnitedTicket(int seat) {
        return "\nConfirmation for: " + name + " \nFor flight " + flightNumber +
                "\nLeaving at " + departureTime + " from " + startingCity + " to " + destinationCity + " on " + departureDate +
                "\nSeat Number: " + seat;
    }

    public void Display() { // displays the information of the reserved ticket
        System.out.println("Name: " + name + " | Date: " + departureDate + " | Flight Number: " + flightNumber + " | Price: $" + price);
    }

    public String seatType(String seat) { // get the seat choice
        if (seat.equalsIgnoreCase("window"))
            return "Window Seat";
        else
            return "Aisle Seat";
    }

    // GETTER AND SETTER

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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
