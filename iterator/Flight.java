package iterator;

// Import packages
import java.util.Iterator;

/**
 * @author Luke Howe
 */

public class Flight {
    
    // Create instance variables
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    // Create constructor
    /**
     * This is the flight constructor. It takes in several values.
     * @param flightNum This value holds the ID number for the plane
     * @param from This value holds where the plane is coming from.
     * @param to This value holds where the plane is going to.
     * @param duration This value holds the duration the plane will take in minutes.
     * @param transfers This value holds the number of transfers that the plane will make.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * This is the getFrom method.
     * @return This method returns where the plane is coming from.
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * This is the getTo method.
     * @return This method returns where the plane is going to.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * This is the getDuration method.
     * @return This method returns the minutes that the plane will take.
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * This is the getNumTransfers method.
     * @return This method returns the number of transfers that the plane will make.
     */
    public int getNumTransfers() {
        return this.transfers;
    }

    /**
     * This is the toString method.
     */
    public String toString() {
        if(transfers == 0) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\nDirect Flight";
        }
        else if(transfers == 1) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\n"+transfers+" Transfer";
        }
        return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes\n"+transfers+" Transfers";
    }

}
