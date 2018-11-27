package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
 * UnitedAirline.FirstClass.java
 */

public class FirstClass extends Business {

    // VARIABLES

    private double price = (getPrice() + (getPrice() * .50)) * 2;

    private boolean tsxi;

    public FirstClass(String name, String startingCity, String destinationCity, int flightNumber, String departureDate, String departureTime) {
        super(name, startingCity, destinationCity, flightNumber, departureDate, departureTime);
    }

    @Override
    public void Display() { // displays the information of the reserved ticket
        super.Display();
        System.out.println("Taxi: Yes");
    }

    public void freeTaxi(boolean taxi) {
       this.tsxi = taxi;
    }
}
