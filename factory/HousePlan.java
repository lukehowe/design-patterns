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

        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<String>();
        features = new ArrayList<String>();

    }

    protected void setMaterials() {
    }

    protected void setFeatures() {
    }

    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        return this.features;
    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    public String toString() {
        String result = "";
        result += "Square Feet: "+squareFeet+"\n";
        result += "Room: "+numRooms+"\n";
        result += "Windows: "+numWindows+"\n";

        result += "\nMaterials:";
        for(String material : materials) {
            result += "\n - " +material+ "";
        }
        result += "\n";

        result += "\nFeatures:";
        for(String feature : features) {
            result += "\n - " +feature+ "";
        }
        result += "\n";
        return result;
    }
}
