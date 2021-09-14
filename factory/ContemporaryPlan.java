package factory;
/**
 * @author Luke Howe
 */
public class ContemporaryPlan extends HousePlan {
    
    public ContemporaryPlan() {
        super();
    }

    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    protected void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }
    
    public String toString() {

    }
}
