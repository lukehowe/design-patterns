package factory;
/**
 * @author Luke Howe
 */
public class LogCabinPlan extends HousePlan {

    public LogCabinPlan() {
        
    }

    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    public String toString() {
        
    }
}
