package adapter;

// Import packages
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
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
        Visit visit = new Visit(date, well, description);
        this.getVisitHistory().add(visit);
        //getVisitHistory().add(visit);
    }

    public ArrayList<Visit> getVisitHistory() {

        ArrayList<Visit> retVisits = new ArrayList<Visit>();

        for(int i = 0 ; i < record.getHistory().size(); i++) {
            String[] splitHistory = record.getHistory().get(i).split("\n");
            Date date = new Date();
            //date = splitHistory[0]
            boolean retWell;
            if(splitHistory[1].equalsIgnoreCase("true")) {
                retWell = true;
            }
            else {
                retWell = false;
            }
            String description = new String();
            splitHistory[2] = description;
            Visit visit = new Visit(date, retWell, description);
            retVisits.add(visit);
        }

        return retVisits;
    }

    public String toString() {
        return "***** "+getFirstName()+" "+getLastName()+" *****\nBirthday: "+getBirthday()+"\nGender: "+getGender()+"\nMedical Visit History: "+getVisitHistory()+"\n";
    }

}
