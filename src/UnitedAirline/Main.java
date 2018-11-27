package UnitedAirline;

import java.util.Scanner;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Projct 2
 * UnitedAirline.Main.java
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Thank you for choosing United Airlines!\nWe currently have 1 flight to Greensboro from Newark(UnitedAirline.Business 310) and 1 flight from Newark to Greensboro(UnitedAirline.Business 320).\n");

        Economy[] e = new Economy[20];
        Business[] b = new Business[20];
        FirstClass[] f = new FirstClass[20];

        do {
            // inputs info of name, flight, date, and class to reserve ticket
            System.out.print("Input information for ticket.\nInput passenger name: ");
            String name = in.next();
            System.out.print("If you would like flight 310, enter '310' or flight 320, enter '320': ");
            int flightNumber = in.nextInt();

            // determine which class the ticket belongs to
            System.out.print("Enter the class you desire. Type 'E' for conomic, 'B' for Business, and 'F' for First-FirstClass: ");
            char flightClass = in.next().charAt(0);
            switch (flightClass) {
                case 'E':
                    e[0] = new Economy(name, "Greensboro", "Newark", flightNumber, "November 14", "8:00 AM");
                    break;
                case 'B':
                    b[0] = new Business(name, "Greensboro", "Newark", flightNumber, "November 14", "8:00 AM");
                    break;
                case 'F':
                    f[0] = new FirstClass(name, "Greensboro", "Newark", flightNumber, "November 14", "8:00 AM");
                    break;
            }

            // print all the tickets in both flights
            System.out.println("\nThe tickets for flight 310: ");
            for (Economy c : e) {
                if (c.getFlightNumber() == 310)
                    c.Display();
            }
            for (Business c : b) {
                if (c.getFlightNumber() == 310)
                    c.Display();
            }
            for (FirstClass c : f) {
                if (c.getFlightNumber() == 310)
                    c.Display();
            }
            System.out.println("\n\nThe tickets for flight 320: ");
            for (Economy c : e) {
                if (c.getFlightNumber() == 320)
                    c.Display();
            }
            for (Business c : b) {
                if (c.getFlightNumber() == 320)
                    c.Display();
            }
            for (FirstClass c : f) {
                if (c.getFlightNumber() == 320)
                    c.Display();
            }

            // continue adding a new ticket
            System.out.print("If you would like to get another ticket, please enter y / n: ");
        } while (!in.next().equalsIgnoreCase("n"));
    }
}
