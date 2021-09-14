package factory;
/**
 * @author Luke Howe
 */

 /**
  * This is the TinyHome Plan class. It is a type of HousePlan that the Factory can make.
  */
public class TinyHomePlan extends HousePlan {
    
    /**
     * This is the constructor for the tiny home. It gives the HousePlan its number of rooms, windows, and square feet, before setting its materials and features.
     */
    public TinyHomePlan() {
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    /**
     * This is the set materials method. It adds the materials exclusive to tiny home.
     */
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }
    
    /**
     * This is the set features method. It adds the features exclusive to log cabin.
     */
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose Areas");
        features.add("Multi-use applications");
    }

    /**
     * This is the toString method. It names itself and then calls HousePlans toString method.
     */
    public String toString() {
        return "Tiny House\n"+super.toString();
    }
}
