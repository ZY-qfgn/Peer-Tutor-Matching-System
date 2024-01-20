/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project_peer.tutor.system;

/**
 *
 * @author john
 */
public class Tutor {
    //declare some variables
    private String firstName, lastName, email;
    //initialize the ccommunity hour as 0
    private double hour=0;
    private int grade;
    private String[] availability = new String[5];
    private String[] subjectList = new String[3];
    private boolean booked;
    
    //constructor
    public Tutor(String fn, String ln, String e, String g, String s1, String s2, String s3, String a1, String a2, String a3, String a4, String a5, String h){
        //initialize the variables
        firstName = fn;
        lastName = ln;
        email = e;
        grade = Integer.parseInt(g);
        subjectList[0] = s1;
        subjectList[1] = s2;
        subjectList[2] = s3;
        availability[0] = a1;
        availability[1] = a2;
        availability[2] = a3;
        availability[3] = a4;
        availability[4] = a5;   
        if (h!=null)
            hour = Double.parseDouble(h);
        booked = false;
    }
    
    public String toString(){
        //automatically convert the information into a readable message
        String sb = "", av = "";
        for (int i=0; i<subjectList.length; i++){
            sb += subjectList[i]+", ";
        }
        av += "\nMonday: "+availability[0]+",\nTuesday: "+availability[1]+",\nWednesday: "+availability[2]+",\nThursday: "+availability[3]+",\nFriday: "+availability[4]+", ";
        return firstName+" "+lastName+", \nemail: "+email+", grade: "+grade+", \nsubjects: "+sb+"\navailability: "+av+"\nhour: "+hour + "\nbooked: " + booked;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }    
    
    public String getEmail(){
        return email;
    }
    
     public int getGrade(){
        return grade;
    }
     
    public String[] getSubject(){
        return subjectList;
    }
    
    public String[] getAvailability(){
        return availability;
    }
    
    public double getHour(){
        return hour;
    }
    
    public boolean getBooked(){
        return booked;
    }
    
    public void setBooked(boolean b){
        booked = b;
    }
    
    public void setFirstName(String fn){
        firstName = fn;
    }


    public void setLastName(String ln){
        lastName = ln;
    }

    public void setGrade(int g){
        grade = g;
    }
        
    public void setSubject(String[] s){
        subjectList = s;
    }
    
    public void setAvailability(String[] a){
        availability = a;
    }
    
    public void setHour(double h){
        hour = h;
    }
    
}
