package factory;
/**
 * @author Luke Howe
 */

 // Import packages
 import java.util.ArrayList;

public abstract class HousePlan {

    // Create instance variables
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    
    // Create constructor
    public HousePlan(int numRooms, int numWindows, int squareFeet) {

    }

    protected void setMaterials() {
    }

    protected void setFeatures() {
    }

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public String toString() {
        return "";
    }
}
