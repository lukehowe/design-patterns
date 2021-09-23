package iterator;

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

    public Airline(String title) {
        this.title = title;
        size = 2;
        flights = new Flight[size];
    }

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

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        size = size * 2;
        //return flights[size];
        Flight[] tempFlights = new Flight[size];

        for(int i = 0; i < flights.length; i++) {
            tempFlights[i] = flights[i];
        }

        this.flights = tempFlights;

        return flights;
        
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }



}
