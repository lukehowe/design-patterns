package factory;
/**
 * @author Luke Howe
 */

 // Import packages
 import java.util.ArrayList;

/**
 *  This is the HousePlan abstract class. Its children inherit its qualities.
 */
public abstract class HousePlan {

    // Create instance variables
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    
    // Create constructor
    /**
     * This is the constructor for the Houseplan.
     * @param numRooms This value holds the number of rooms in the house.
     * @param numWindows This value holds the number of windows in the house.
     * @param squareFeet This value holds the number of square feet in the house.
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {

        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<String>();
        features = new ArrayList<String>();

    }

    /**
     * This is a method that HousePlan's children must inherit.
     */
    protected void setMaterials() {
    }

    /**
     * This is a method that HousePlan's children must inherit.
     */
    protected void setFeatures() {
    }

    /**
     * This is the accessor for the materials instance variable.
     * @return This method returns the ArrayList of Strings called materials.
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    /**
     * This is the accessor for the features instance variable.
     * @return This method returns the ArrayList of Strings called features.
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }

    /**
     * This is the accessor for the number of rooms instance variable.
     * @return This method returns the number of rooms.
     */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * This is the accessor for the number of windows instance variable.
     * @return This method returns the number of windows.
     */
    public int getNumWindows() {
        return this.numWindows;
    }

    /**
     * This is the accessor for the number of square feet instance variable.
     * @return This method returns the number of square feet.
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * This is the toString method. It makes everything come out nice.
     */
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
