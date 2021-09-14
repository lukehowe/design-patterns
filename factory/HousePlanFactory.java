package factory;

/**
 * @author Luke Howe
 */

 /**
  * This is the House Plan Factory class. It is used from the driver to create new House Plans.
  */
public class HousePlanFactory {
    
    /**
     * This is the Create House Plan method. It is called from the driver to create new House Plans.
     * @param type This value holds the keyword entered from the driver. It is checked to create the right type of House Plan.
     * @return This method returns the right new type of house plan.
     */
    public static HousePlan createHousePlan(String type) {

        if(type.equalsIgnoreCase("log cabin"))
            return new LogCabinPlan();
           
        else if(type.equalsIgnoreCase("tiny home"))
            return new TinyHomePlan();

        return new ContemporaryPlan();

        
    }
}
