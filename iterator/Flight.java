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
        
        if(transfers == 0) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\nDirect Flight";
        }
        else if(transfers == 1) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\n"+transfers+" Transfer";
        }
        return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\n"+transfers+" Transfers";
        
        //return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\n"+transfers+" Transfers";
        //Direct Flight or 1 Transfer or X Transfers";

    }

}
