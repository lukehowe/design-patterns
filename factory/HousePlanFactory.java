package factory;

/**
 * @author Luke Howe
 */
public class HousePlanFactory {
    
    public static HousePlan createHousePlan(String type) {

        if(type.equalsIgnoreCase("log cabin"))
            return new LogCabinPlan();
           
        else if(type.equalsIgnoreCase("tiny home"))
            return new TinyHomePlan();

        return new ContemporaryPlan();

        
    }
}
