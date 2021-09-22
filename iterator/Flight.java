package iterator;

public class Flight {
    
    // Create instance variables
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    // Create constructor
    public Flight(String flightNum, String from, String to, int duration, int transfers) {

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
        return "test";
    }

}
