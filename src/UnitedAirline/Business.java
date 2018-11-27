package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.Business.java
 */

public class Business extends Economy {

    // VARIABLES

    private double price;

    private String snack;

    public Business(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);
        this.price = getPrice() + (getPrice() * .50);
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println(" | Snack: " + snack);
    }

    public void snackType() {  // get the snack choice
        if (snack.equalsIgnoreCase("cookies"))
            this.snack = "Cookies";
        else
            this.snack = "Peanuts";
    }
}
