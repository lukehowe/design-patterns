package adapter;

// Import packages
import java.util.Date;
import java.util.ArrayList;
/**
 * @author Luke Howe
 */

public class MedicalRecordAdapter {

    // Create instance variables
    private HealthRecord record;

    // Create constructor
    public MedicalRecordAdapter(HealthRecord record) {

    }

    public String getFirstName() {
        return "";
    }

    public String getLastName() {
        return "";
    }
    
    public Date getBirthday() {
        //TODO return date
    }

    public Gender getGender() {
         //TODO return gender
    }

    public void addVisit(Date date, boolean well, String description) {

    }

    public ArrayList<Visit> getVisitHistory() {
        //TODO return Visit history
    }

    public String toString() {
        return "";
    }

}
