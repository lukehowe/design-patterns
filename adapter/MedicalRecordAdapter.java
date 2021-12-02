package adapter;

// Import packages
import java.util.Date;
import java.util.ArrayList;
/**
 * @author Luke Howe
 */

public class MedicalRecordAdapter implements MedicalRecord {

    // Create instance variables
    private HealthRecord record;

    // Create constructor
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        String[] split = record.getName().split(" ");
        String firstName = split[0];
        return firstName;
    }

    public String getLastName() {
        String[] split = record.getName().split(" ");
        String lastName = split[1];
        return lastName;
    }
    
    public Date getBirthday() {
        return record.getBirthdate();
    }

    public Gender getGender() {
        if(record.getGender().contains("male")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    public void addVisit(Date date, boolean well, String description) {
        //Visit visit;
        //visit = new Visit(date, well, description);
        
    }

    public ArrayList<Visit> getVisitHistory() {
        //TODO return Visit history
    }

    public String toString() {
        return "";
    }

}
