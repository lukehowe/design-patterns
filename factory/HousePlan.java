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

    }

    public ArrayList<String> getFeatures() {

    }

    public int getNumRooms() {

    }

    public int getNumWindows() {

    }

    public int getSquareFeet() {

    }
    
    public String toString() {

    }
}
