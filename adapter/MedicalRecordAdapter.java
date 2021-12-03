package adapter;

// Import packages
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * @author Luke Howe
 */

 /**
  * This is the MedicalRecordAdapter class. It implements MedicalRecord, and adapts HealthRecords to MedicalRecords.
  */
public class MedicalRecordAdapter implements MedicalRecord {

    // Create instance variables
    private HealthRecord record;

    // Create constructor
    /**
     * This is the constructor for the MedicalRecordAdapter. It takes a Health record as a parameter and adapts it into a medical record.
     * @param record This is the Health Record that is being adapted.
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * This is the getFirstName method. It takes in the full name from the health record and splits it to retrieve the first name.
     */
    public String getFirstName() {
        String[] split = record.getName().split(" ");
        String firstName = split[0];
        return firstName;
    }

    /**
     * This is the getFirstName method. It takes in the full name from the health record and splits it to retrieve the last name.
     */
    public String getLastName() {
        String[] split = record.getName().split(" ");
        String lastName = split[1];
        return lastName;
    }
    
    /**
     * This is the getBirthday method. It takes in the user's birthdate from the health record and returns it for the medical record.
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * This is the getGender method. It takes in the health record's gender string and returns it as an enumeration for the medical record.
     */
    public Gender getGender() {
        if(record.getGender().equalsIgnoreCase("male")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    /**
     * This is the addVisit method. It takes in a date, a boolean to tell if the visit was well or not, and a String for description. It then adds the visit as
     * a history to be adapted into a Visit object later.
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * This is the makeDate method. It takes in a year, month, and date as integers and creates a date object for it. I took this from the driver class.
     * @param year This integer carries the value for the year.
     * @param month This integer carries the value for the month.
     * @param day This integer carries the value for the day.
     * @return This method returns a date.
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    /**
     * This is the getVisitHistory method. It takes a health record and converts the visit history into an arrayList of visits.
     */
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

    /**
     * This is the visitToString class. It takes a Visit and returns an organized string version of it.
     * @return Returns a string that organizes a visit.
     */
    public String visitToString() {
        String str = new String();
        for(int i = 0; i < getVisitHistory().size(); i++) {
            str += getVisitHistory().get(i).toString()+"\n";
        }
        return str;
    }

    /**
     * This is the toString method. It returns an adapted medical record in an easy-to-read string version.
     */
    public String toString() {
        return "***** "+getFirstName()+" "+getLastName()+" *****\nBirthday: "+getBirthday()+"\nGender: "+getGender()+"\nMedical Visit History:\n"+visitToString()+"\n";
    }

}
