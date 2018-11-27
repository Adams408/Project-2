package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.FirstClass.java
 */

public class FirstClass extends Economy {

    // VARIABLES

    private double price = (getPrice() + (getPrice() * .50)) * 2;

    public FirstClass(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);
    }

    @Override
    public void Display() { // displays the information of the reserved ticket
        System.out.println("Name: " + getName() + " | Date: " + getDepartureDate() + " | Flight Number: " + getFlightNumber() + " | Price: $" + price);
    }

    public String snackType(String snack) {  // get the snack choice
        if (snack.equalsIgnoreCase("cookies"))
            return "Cookies";
        else
            return "Peanuts";
    }

    public boolean freeTaxi(boolean taxi) {
       return taxi;
    }
}
