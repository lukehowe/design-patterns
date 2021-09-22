package iterator;

/**
 * @author Luke Howe
 */

public class Airline {
    
    // Create instance variables
    private String title;
    private Flight[] flights;
    private int size;

    // Create constructor

    public Airline(String title) {
        this.title = title;
        size = 2;
        flights = new Flight[size];
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {

    }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {

    }

    public FlightIterator createIterator() {
        
    }



}
