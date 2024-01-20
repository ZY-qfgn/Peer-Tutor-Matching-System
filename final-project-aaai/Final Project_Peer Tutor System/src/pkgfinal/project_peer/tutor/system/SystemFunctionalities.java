/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project_peer.tutor.system;
import java.util.*;
import java.io.*;

/**
 *
 * @author selin
 */
public class SystemFunctionalities {
    File tuteeFile = new File("Peer Tutor Registration Sheet_ Tutee (Responses) - Form Responses 1.csv");
    File tutorFile = new File("Peer Tutor Registration Sheet_ Tutor (Responses) - Form Responses 1.csv");
    File hourFile = new File("Tutur's Hour Report Sheet (Responses) - Form Responses 1.csv");
    File matchedFile = new File("Matched List.csv");
    ArrayList<Tutee> tuteeList = new ArrayList<Tutee>();
    ArrayList<Tutor> tutorList = new ArrayList<Tutor>();
    ArrayList<String> matchedList = new ArrayList<String>();
    Scanner tuteeScan = null;
    Scanner tutorScan = null;
    Scanner hourScan = null;
    Scanner matchedScan = null;
    PrintWriter tuteePw = null;
    PrintWriter tutorPw = null;
    PrintWriter hourPw = null;
    PrintWriter matchedPw = null;
    
    /**
     * this constructor fills the tutee and tutor lists
     */
    public SystemFunctionalities(){
        //try catch for IOException
        try {
            tuteeScan = new Scanner(tuteeFile);
            tutorScan = new Scanner(tutorFile);
            hourScan = new Scanner(hourFile);
            matchedScan = new Scanner(matchedFile);
        } catch (IOException ex) {
            System.out.println("The file doesn't exist.");
        }
        //skip first line (labels)
        tuteeScan.nextLine();
        tutorScan.nextLine();
        hourScan.nextLine();
        matchedScan.nextLine();
        //read each line of the tutee file and fill tuteeList with info
        while(tuteeScan.hasNextLine()){
            String[] tempArray = tuteeScan.nextLine().split(",");
            Tutee tutee = new Tutee(tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], tempArray[11], tempArray[12]);
            tuteeList.add(tutee);
        }
        //read each line of the tutor file and fill tutorList with info
        while(tutorScan.hasNextLine()){
            String[] tempArray = tutorScan.nextLine().split(",");
            Tutor tutor = new Tutor(tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], tempArray[11], tempArray[12], tempArray[13]);
            tutorList.add(tutor);
        }
        //read each line of the hour file and add to hours where appropriate
        while(hourScan.hasNextLine()){
            String[] tempArray = hourScan.nextLine().split(",");
            //loop through list of tutors
            for(int i = 0; i < tutorList.size(); i++){
                //find tutor
                if(tutorList.get(i).getFirstName().equals(tempArray[1]) && tutorList.get(i).getLastName().equals(tempArray[2])){
                    //add hours
                    tutorList.get(i).setHour(tutorList.get(i).getHour()+Integer.parseInt(tempArray[5]));
                }
            }
        }
        //read each line of the matched file and fill matchedList with info
        while(matchedScan.hasNextLine()){
            matchedList.add(matchedScan.nextLine());
        }
        tuteeScan.close();
        tutorScan.close();
        hourScan.close();
        matchedScan.close();
    }
    
    /**
     * the match method takes in a tutee and sorts a temporary tutor list based on subject, grade, and availability
     * @param t     the tutee to be matched
     * @return      arraylist of matched tutors
     */
    public ArrayList<Tutor> match(Tutee t){
        ArrayList<Tutor> tempList = new ArrayList<Tutor>();
        ArrayList<Tutor> tempList2 = new ArrayList<Tutor>();
        boolean subjectMatch = false, availabilityMatch = false;
        //loop through list of tutors
        for(int i = 0; i < tutorList.size(); i++){
            //loop through tutor's subject array
            for(int j = 0; j < tutorList.get(i).getSubject().length; j++){
                //loop through tutee's subject array
                for(int k = 0; k < t.getSubject().length; k++){
                    //change match to true if the subjects are equal
                    if(tutorList.get(i).getSubject()[j].equals(t.getSubject()[k]) && !tutorList.get(i).getSubject()[j].equals("N/A")){
                        subjectMatch = true;
                    }
                }
            }
            //loop through tutor's availability array
            for(int j = 0; j < tutorList.get(i).getAvailability().length; j++){
                //loop through tutee's availability array
                for(int k = 0; k < t.getAvailability().length; k++){
                    //change match to true if the availabilities are equal
                    if(tutorList.get(i).getAvailability()[j].equals(t.getAvailability()[k]) && !tutorList.get(i).getAvailability()[j].equals("Not available")){
                        availabilityMatch = true;
                    }
                }
            }
            //check if subject, grade, and availability match
            if(tutorList.get(i).getBooked() == false && subjectMatch == true && t.getGrade() <= tutorList.get(i).getGrade() && availabilityMatch == true){
                tempList.add(tutorList.get(i));
            }
            //check if subject and grade match (this will be listed behind tutors that match for in aspects in the final list)
            else if(tutorList.get(i).getBooked() == false && subjectMatch == true && t.getGrade() <= tutorList.get(i).getGrade()){
                tempList2.add(tutorList.get(i));
            }
            subjectMatch = false;
            availabilityMatch = false;
        }
        //combine the lists
        tempList.addAll(tempList2);
        return tempList;
    }
    
    /**
     * the searchTutee method takes in the first and last name of the tutee and returns the object.
     * @param fN    first name of the tutee
     * @param lN    last name of the tutee
     * @return      tutee object
     */
    public Tutee searchTutee(String fN, String lN){
        //loop through list of tutees
        for(int i = 0; i < tuteeList.size(); i++){
            //find tutee
            if(tuteeList.get(i).getFirstName().equals(fN) && tuteeList.get(i).getLastName().equals(lN)){
                //return tutee
                return tuteeList.get(i);
            }
        }
        return null;
    }
    
    /**
     * the searchTutor method takes in the first and last name of the tutor and returns the object.
     * @param fN    first name of the tutor
     * @param lN    last name of the tutor
     * @return      tutor object
     */
    public Tutor searchTutor(String fN, String lN){
        //loop through list of tutors
        for(int i = 0; i < tutorList.size(); i++){
            //find tutor
            if(tutorList.get(i).getFirstName().equals(fN) && tutorList.get(i).getLastName().equals(lN)){
                //return tutor
                return tutorList.get(i);
            }
        }
        return null;
    }
    
    /**
     * the removeTutee method removes a tutee from the list given the name
     * @param fN    first name of the tutee to be removed
     * @param lN    last name of the tutee to be removed
     */
    public void removeTutee(String fN, String lN){
        //loop through list of tutees
        for(int i = 0; i < tuteeList.size(); i++){
            //find tutor
            if(tuteeList.get(i).getFirstName().equals(fN) && tuteeList.get(i).getLastName().equals(lN)){
                //remove tutee
                tuteeList.remove(i);
            }
        }
    }
    
    /**
     * the removeTutor method removes a tutor from the list given the name
     * @param fN    first name of the tutor to be removed
     * @param lN    last name of the tutor to be removed
     */
    public void removeTutor(String fN, String lN){
        //loop through list of tutors
        for(int i = 0; i < tutorList.size(); i++){
            //find tutor
            if(tutorList.get(i).getFirstName().equals(fN) && tutorList.get(i).getLastName().equals(lN)){
                //remove tutor
                tutorList.remove(i);
            }
        }
    }
    
    /**
     * the matchedList takes in the information of the tutor and the tutee and adds them to the matchedList
     * @param tutor     tutor information
     * @param tutee     tutee information
     */
    public void matchedList(String tutor, String tutee){
        //add the tutor and tutee to the matched list
        Tutor theTutor = searchTutor(tutor.split(" ")[0], tutor.split(" ")[1]);
        Tutee theTutee = searchTutee(tutee.split(" ")[0], tutee.split(" ")[1]);
        matchedList.add(tutor + " " + theTutor.getEmail() + " and " + tutee + " " + theTutee.getEmail());
        //search for tutee and remove from tutee list
        removeTutee(tutee.split(" ")[0], tutee.split(" ")[1]);
        //loop through list of tutors
        for(int i = 0; i < tutorList.size(); i++){
            //find tutor
            if(tutorList.get(i).getFirstName().equals(tutor.split(" ")[0]) && tutorList.get(i).getLastName().equals(tutor.split(" ")[1])){
                //change tutor status
                tutorList.get(i).setBooked(true);
            }
        }
    }
    
    /**
     * the removeMatched method takes in the information of the match and remove the match from the list
     * @param tutor     tutor information
     * @param tutee     tutee information
     */
    public void removeMatched(String tutor, String tutee){
        //loop through list of matches
        for(int i = 0; i < matchedList.size(); i++){
            //find match
            if(matchedList.get(i).split(" ")[0].equals(tutor.split(" ")[0]) && matchedList.get(i).split(" ")[1].equals(tutor.split(" ")[1])){
                //remove match
                matchedList.remove(i);
            }
        }
        //loop through list of tutors
        for(int i = 0; i < tutorList.size(); i++){
            //find tutor
            if(tutorList.get(i).getFirstName().equals(tutor.split(" ")[0]) && tutorList.get(i).getLastName().equals(tutor.split(" ")[1])){
                //change tutor status
                tutorList.get(i).setBooked(false);
            }
        }
    }
    
    /**
     * the rewriteFiles rewrite to the tutee and tutor files after changes have been made
     */
    public void rewriteFiles(){
        //try catch for IOException
        try {
            tuteePw = new PrintWriter(new FileWriter(tuteeFile, false));
            tutorPw = new PrintWriter(new FileWriter(tutorFile, false));
            hourPw = new PrintWriter(new FileWriter(hourFile, false));
            matchedPw = new PrintWriter(new FileWriter(matchedFile,false));
        } catch (IOException ex) {
            System.out.println("The file doesn't exist.");
        }
        //print the labels into the files
        tuteePw.println("Timestamp,First Name,Last Name,Email,Grade,Subject1,Subject2,Subject3,Availability [Monday],Availability [Tuesday],Availability [Wednesday],Availability [Thursday],Availability [Friday]");
        tutorPw.println("Timestamp,First Name,Last Name,Email,Grade,Subject1,Subject2,Subject3,Availability [Monday],Availability [Tuesday],Availability [Wednesday],Availability [Thursday],Availability [Friday],hour");
        matchedPw.println("Tutor name,Tutee name");
        //loop through list of tutees and add each tutee to file
        for(int i = 0; i < tuteeList.size(); i++){
            tuteePw.println(" ," + tuteeList.get(i).getFirstName() + "," + tuteeList.get(i).getLastName() + "," + tuteeList.get(i).getEmail() + "," + tuteeList.get(i).getGrade() + "," + tuteeList.get(i).getSubject()[0] +"," + tuteeList.get(i).getSubject()[1] + "," + tuteeList.get(i).getSubject()[2] +"," + tuteeList.get(i).getAvailability()[0] +"," + tuteeList.get(i).getAvailability()[1] +"," + tuteeList.get(i).getAvailability()[2] +"," + tuteeList.get(i).getAvailability()[3] +"," + tuteeList.get(i).getAvailability()[4]);
        }
        //loop through list of tutors and add each tutor to file
        for(int i = 0; i < tutorList.size(); i++){
            tutorPw.println(" ," + tutorList.get(i).getFirstName() + "," + tutorList.get(i).getLastName() + "," + tutorList.get(i).getEmail() + "," + tutorList.get(i).getGrade() + "," + tutorList.get(i).getSubject()[0] +"," + tutorList.get(i).getSubject()[1] + "," + tutorList.get(i).getSubject()[2] +"," + tutorList.get(i).getAvailability()[0] +"," + tutorList.get(i).getAvailability()[1] +"," + tutorList.get(i).getAvailability()[2] +"," + tutorList.get(i).getAvailability()[3] +"," + tutorList.get(i).getAvailability()[4]+ "," + tutorList.get(i).getHour());
        }
        //reset hours file
        hourPw.print("Timestamp,First Name,Last Name,Email Address,student,hours");
        //loop through list of matches and add each match to file
        for(int i = 0; i < matchedList.size(); i++){
            matchedPw.println(matchedList.get(i));
        }
        tuteePw.close();
        tutorPw.close();
        hourPw.close();
        matchedPw.close();
    }
}
