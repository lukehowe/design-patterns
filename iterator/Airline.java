package iterator;

// Import packages
import java.util.Iterator;

/**
 * @author Luke Howe
 */

public class Airline {
    
    // Create instance variables
    private String title;
    private Flight[] flights;
    private int size;

    // Create constructor
    /**
     * This is the airline constructor. It takes in a String title.
     * @param title This value holds the name of the airline.
     */
    public Airline(String title) {
        this.title = title;
        size = 2;
        flights = new Flight[size];
    }

    /**
     * This is the addFlight method. It adds flights to the array of flights. If the array is full, it multiplies the size of the array by 2.
     * @param flightNum This value holds the ID number of the flight.
     * @param from This value holds the location where the plane is coming from.
     * @param to This value holds the location where the plan is going to.
     * @param duration This value holds the minutes the flight will take.
     * @param transfers This value holds the number of transfers the ticket will require.
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flight = new Flight(flightNum, from, to, duration, transfers);
        if(flights[size-1] != null) {
            growArray(flights);
            for(int i = 0; i < flights.length; i++) {
                if(flights[i] == null) {
                    flights[i] = flight;
                    break;
                }
            }
        }
        else {
            for(int i = 0; i < flights.length; i++) {
                if(flights[i] == null) {
                    flights[i] = flight;
                    break;
                }
            }
        }
    }

    /**
     * This is the getTitle method. It returns the name of the airline.
     * @return This method returns title of this airline.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * This is the growArray method. It ensures that the array's size is multiplied by 2 if the array was full when a new plane was attempted to be added.
     * @param flights This array holds the list of flights in the airline.
     * @return This method returns the new list of flights after having been grown.
     */
    private Flight[] growArray(Flight[] flights) {
        size = size * 2;
        Flight[] tempFlights = new Flight[size];
        for(int i = 0; i < flights.length; i++) {
            tempFlights[i] = flights[i];
        }
        this.flights = tempFlights;
        return flights;
    }

    /**
     * This is the createIterator method.
     * @return This method returns a new iterator passing in the array of flights.
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }



}
