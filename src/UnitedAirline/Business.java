package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.Business.java
 */

public class Business extends Economy {

    // VARIABLES

    private String name;
    private String startingCity;
    private String destinationCity;
    private int flightNumber;
    private String departureDate;
    private String departureTime;

    private double price = 450;

    private String seat;
    private String snack;

    public Business(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);

        this.name = name;
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }

    @Override
    public String reserveUnitedTicket() {
        return super.reserveUnitedTicket();
    }

    @Override
    public void Display() {
        System.out.println("Name: " + name + " | Date: " + departureDate + " | Flight Number: " + flightNumber + " | Price: $" + price);
    }

    @Override
    public void seatType(String seat) { // get the seat choice
        super.seatType(seat);
        this.seat = super.getSeat();
    }

    public void snackType(String snack) {  // get the snack choice
        if (snack.equalsIgnoreCase("cookies"))
            this.snack = "Cookies";
        else if (snack.equalsIgnoreCase("peanuts"))
            this.snack = "Peanuts";
    }

    // GETTER AND SETTER

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getStartingCity() {
        return startingCity;
    }

    @Override
    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    @Override
    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    @Override
    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String getDepartureDate() {
        return departureDate;
    }

    @Override
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String getSeat() {
        return seat;
    }

    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }
}
