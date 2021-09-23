package iterator;

import java.util.Iterator;

public class Flight {
    
    // Create instance variables
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    // Create constructor
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

    public String toString() {
        return "FlightNumber:"+flightNum+"\nFrom:\nTo:\nDuration:\nDirect Flight or 1 Transfer or X Transfers";

    }

}
