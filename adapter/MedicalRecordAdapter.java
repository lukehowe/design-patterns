package adapter;

// Import packages
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

import javax.swing.text.DateFormatter;

import java.util.ArrayList;
import java.util.Calendar;
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
        if(record.getGender().equalsIgnoreCase("male")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    public void addVisit(Date date, boolean well, String description) {
        
        //Visit visit = new Visit(date, well, description);
        //getVisitHistory().add(visit);
        record.addHistory(date, well, description);
    }

    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    public ArrayList<Visit> getVisitHistory() {

        
        ArrayList<Visit> retVisits = new ArrayList<Visit>();

        for(int i = 0 ; i < record.getHistory().size(); i++) {
            String[] splitHistory = record.getHistory().get(i).split("\n");

            String[] splitDate = splitHistory[0].split(" ");
            String[] splitCommaDay = splitDate[2].split(",");
            String[] splitCommaMonth = splitDate[3].split(",");

            int day = Integer.parseInt(splitCommaDay[0]);
            int month = Integer.parseInt(splitCommaMonth[0]);
            int year = Integer.parseInt(splitDate[4]);
            Date date = makeDate(year, month, day);
            
            boolean retWell;
            if(splitHistory[1].contains("true")) {
                retWell = true;
            }
            else {
                retWell = false;
            }
            String description = new String();
            description = splitHistory[2];
            Visit visit = new Visit(date, retWell, description);
            retVisits.add(visit);
        }
        return retVisits;
        
    }

    public String visitToString() {
        String str = new String();
        for(int i = 0; i < getVisitHistory().size(); i++) {
            str += getVisitHistory().get(i).toString()+"\n";
        }
        return str;
    }

    public String toString() {

        return "***** "+getFirstName()+" "+getLastName()+" *****\nBirthday: "+getBirthday()+"\nGender: "+getGender()+"\nMedical Visit History:\n"+visitToString()+"\n";
    }

}
