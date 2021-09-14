package factory;
/**
 * @author Luke Howe
 */

 /**
  * This is the LogCabin Plan class. It is a type of HousePlan that the Factory can make.
  */
public class LogCabinPlan extends HousePlan {

    /**
     * This is the constructor for the log cabin. It gives the HousePlan its number of rooms, windows, and square feet, before setting its materials and features.
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    /**
     * This is the set materials method. It adds the materials exclusive to log cabin.
     */
    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * This is the set features method. It adds the features exclusive to log cabin.
     */
    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * This is the toString method. It names itself and then calls HousePlans toString method.
     */
    public String toString() {
        return "Log Cabin\n"+super.toString();
    }
}
