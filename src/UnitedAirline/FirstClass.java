package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.FirstClass.java
 */

public class FirstClass extends Business {

    // VARIABLES

    private double price;

    private boolean tsxi;

    public FirstClass(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);
        this.price = (getPrice() + (getPrice() * .50)) * 2;
    }

    @Override
    public void Display() { // displays the information of the reserved ticket
        super.Display();
        if (tsxi)
            System.out.println(" | Free Taxi: Yes");
        else
            System.out.println(" | Free Taxi: No");
    }

    public void freeTaxi(String taxi) {
        this.tsxi = taxi.equalsIgnoreCase("yes");
    }
}
