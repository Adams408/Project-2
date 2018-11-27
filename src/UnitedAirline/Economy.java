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

    private String seat;

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
        System.out.println("Name: " + name + " | Date: " + departureDate + " | Flight Number: " + flightNumber + " | Price: $" + price + " | Seat Type: " + seat);
    }

    public void seatType() { // get the seat choice
        if (seat.equalsIgnoreCase("window"))
            this.seat = "Window Seat";
        else
            this.seat = "Aisle Seat";
    }

    // GETTER AND SETTER

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
