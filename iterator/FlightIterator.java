package iterator;

/**
 * @author Luke Howe
 */

public class FlightIterator implements Iterator {
    
    // Create instance variables

    private Flight[] flights;
    private int position;

    // Create constructor

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }

}
