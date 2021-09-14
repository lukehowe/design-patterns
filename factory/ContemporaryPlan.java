package factory;
/**
 * @author Luke Howe
 */

 /**
  * This is the ContemporaryHome Plan class. It is a type of HousePlan that the Factory can make.
  */
public class ContemporaryPlan extends HousePlan {
    
    /**
     * This is the constructor for the contemporary home. It gives the HousePlan its number of rooms, windows, and square feet, before setting its materials and features.
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }

    /**
     * This is the set materials method. It adds the materials exclusive to contemporary plan.
     */
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * This is the set features method. It adds the features exclusive to contemporary plan.
     */
    protected void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }
    
    /**
     * This is the toString method. It names itself and then calls HousePlans toString method.
     */
    public String toString() {
        return "Contemporary Home\n"+super.toString();
    }
}
