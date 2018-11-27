package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.Business.java
 */

public class Business extends Economy {

    // VARIABLES

    private double price = getPrice() + (getPrice() * .50);

    public Business(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println(" | Snack: $" + price);
    }

    public String snackType(String snack) {  // get the snack choice
        if (snack.equalsIgnoreCase("cookies"))
            return "Cookies";
        else
            return "Peanuts";
    }
}
