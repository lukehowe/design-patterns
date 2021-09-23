package iterator;

// Import packages
import java.util.Iterator;

/**
 * @author Luke Howe
 */

    /**
     * This is the flight iterator class. It implements Java.util.Iterator. It is used to iterate through airlines.
     */
    public class FlightIterator implements Iterator {
    
    // Create instance variables
    private Flight[] flights;
    private int position;

    // Create constructor
    /**
     * This is the flight iterator constructor. It takes in an array of Flights called flights.
     * @param flights This value contains the list of flights in the airline.
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * This is the hasNext method. It is used by the driver to run the program and iterate through the flights.
     */
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * This is the next method. It is used by the driver to run the program and iterate through the flights.
     */
    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }

}
