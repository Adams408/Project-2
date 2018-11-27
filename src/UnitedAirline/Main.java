package UnitedAirline;

import java.util.Scanner;

/**
 * James Adams, Davian Glenn
 * November 14, 2018
 * Project 2
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
            String sCity = "Greensboro";
            String dCity = "Newark";
            String dDate = "November 14";
            String dTime = "8:00 AM";
            if (flightNumber == 320) {
                sCity = "Newark";
                dCity = "Greensboro";
                dDate = "November 14";
                dTime = "1:59 PM";
            }

            // determine which class the ticket belongs to
            System.out.print("Enter the class you desire. Type 'E' for Economy, 'B' for Business, and 'F' for First-Class: ");
            char flightClass = in.next().charAt(0);
            System.out.print("Select a seat: ");
            int seat = in.nextInt();

            int eC = 0;
            int bC = 0;
            int fC = 0;
            for (int i = 0; i < e.length; i++) {
                if (e[i] != null) {
                    eC++;
                }
                if (b[i] != null) {
                    bC++;
                }
                if (f[i] != null) {
                    fC++;
                }
            }

            switch (flightClass) {
                case 'E':
                    if (eC == e.length) {
                        System.out.println("Airplane is full.");
                        break;
                    }
                    while (e[seat] != null){
                        System.out.print("Seat taken choose again: ");
                        seat = in.nextInt();
                    }
                    e[seat - 1] = new Economy(name, sCity, dCity, flightNumber, dDate, dTime);
                    System.out.println(e[seat - 1].reserveUnitedTicket(seat));
                    break;
                case 'B':
                    if (bC == b.length) {
                        System.out.println("Airplane is full.");
                        break;
                    }
                    while (b[seat] != null){
                        System.out.print("Seat taken choose again: ");
                        seat = in.nextInt();
                    }
                    b[seat - 1] = new Business(name, sCity, dCity, flightNumber, dDate, dTime);
                    System.out.println(b[seat - 1].reserveUnitedTicket(seat));
                    break;
                case 'F':
                    if (fC == f.length) {
                        System.out.println("Airplane is full.");
                        break;
                    }
                    while (f[seat] != null){
                        System.out.print("Seat taken choose again: ");
                        seat = in.nextInt();
                    }
                    f[seat - 1] = new FirstClass(name, sCity, dCity, flightNumber, dDate, dTime);
                    System.out.println(f[seat - 1].reserveUnitedTicket(seat));
                    break;
            }

            // continue adding a new ticket
            System.out.print("\nIf you would like to get another ticket, please enter y / n: ");
        } while (!in.next().equalsIgnoreCase("n"));

        // print all the tickets in both flights
        System.out.println("\nThe tickets for flight 310: ");
        for (Economy c : e) {
            if (c != null)
                if (c.getFlightNumber() == 310)
                    c.Display();
        }
        for (Business c : b) {
            if (c != null)
                if (c.getFlightNumber() == 310)
                    c.Display();
        }
        for (FirstClass c : f) {
            if (c != null)
                if (c.getFlightNumber() == 310)
                    c.Display();
        }
        System.out.println("\nThe tickets for flight 320: ");
        for (Economy c : e) {
            if (c != null)
                if (c.getFlightNumber() == 320)
                    c.Display();
        }
        for (Business c : b) {
            if (c != null)
                if (c.getFlightNumber() == 320)
                    c.Display();
        }
        for (FirstClass c : f) {
            if (c != null)
                if (c.getFlightNumber() == 320)
                    c.Display();
        }
    }
}
