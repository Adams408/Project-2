/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Ticket.java
 */

public class Ticket {

    private String name;
    private char flightClass;
    private int seat, price;

    public Ticket(String name, char flightClass) {
        this.name = name;
        this.flightClass = flightClass;
    }

    public int Price(){
        switch(this.flightClass){
            case 'E':
                price = 300;
                break;
            case 'B':
                price = 450;
                break;
            case 'F':
                price = 900;
                break;
        }
        return price;
    }

    public int Seat(){
        switch(this.flightClass){
            case 'E':
                seat = 15;
                break;
            case 'B':
                seat = 10;
                break;
            case 'F':
                seat = 5;
                break;
        }
        return seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }
}
