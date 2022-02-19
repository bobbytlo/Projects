/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydriver;

/**
 *The purpose of this class is to distinguish between students at university
 * @author Bobby Lo
 * @version 1.0
 */
public class Student {
    private String firstName;
    private char middleInitial;
    private String lastName;
    private String studentID;
    private int age;
    private boolean liveOnCampus;
    private double balance;
    
    
/**
* parameterized constructor that creates and initialized the objects with the values passed
* @param fName firstName of the student
* @param mInitial middleInitial of the student
* @param lName lastName of the student
* @param ID ID of the student
* @param studentAge age of the student
* @param isLiveOnCampus represents if the student lives on the campus or not
*/
public Student(String fName, char mInitial, String lName, String ID , int studentAge, boolean isLiveOnCampus) {
    firstName = fName;
    middleInitial = mInitial;
    lastName = lName;
    studentID = ID;
    age = studentAge;
    liveOnCampus = isLiveOnCampus; 
    balance = 0;
}
/**
 * method that returns students first name
 * @return firstName of the student
 */
    public String getFirstName() {         
        return firstName;     
    }
 /**
  * method that returns students middle initial letter
  * @return middleInitial of the student 
  */
    public char getMiddleInitial() {
        return middleInitial;
    }
/**
 * method that returns the students last name
 * @return lastName of the student
 */    
    public String getLastName() {
        return lastName;
    }
 /**
  * method that returns the students ID numbers
  * @return studentID number of the student
  */
    public String getStudentID () {
        return studentID; 
    }
/** 
 * method that returns the students age
 * @return age of student
 */
    public int getAge() {
        return age;
    }
/**
 * method that returns if the student lives on campus
 * @return liveOnCampus true or false for the student  
 */
    public boolean getLiveOnCampus() {
        return liveOnCampus;
    }
/** 
 * method to get student balance on 49er card
 * @return balance of the student's card
 */
     public double getBalance()
   {
       return balance;
   }
    
    
     
     
     
     
/**
* method that sets the firstName of the student to fName
* @param fName first name of the student
*/
    public void setFirstName(String fName) {        
        firstName = fName;     
    }
 /**
 * method that sets the students middleInitial to mInitial
 * @param mInitial middle initial of the student
 */
    public void setMiddleInitial(char mInitial) {        
        middleInitial = mInitial;     
    }
/**
 * method that sets the students lastName to lName
 * @param lName last name of the student 
 */    
    public void setLastName(String lName) {        
        lastName = lName;     
    }
 /**
 * method that sets the studentID to ID
 * @param ID student's ID number
 */
    public void setStudentID(String ID) {        
        studentID = ID;     
    }
/**
 * method that sets age to StudentAge
 * @param StudentAge students age
 */    
    public void setAge(int StudentAge) {        
        age = StudentAge;     
    }
/**
 * method that sets liveOnCampus to isLiveOnCampus
 * @param isLiveOnCampus if the student lives on campus or not
 */    
    public void setLiveOnCampus(boolean isLiveOnCampus) {
        liveOnCampus = isLiveOnCampus;
    }
/** 
 * method that adds amount to balance 
 * @param amount the amount to be added to balance
 */    
     public void transferToCard(double amount){
         if(amount > 0) {
             balance += amount;
         System.out.println("Balance: " + balance);
     }
     else
        System.out.println("The transfer amount must be greater than 0");
     }
/**
 * method that subtracts amount from balance 
 * @param amount the amount to be subtracted from balance 
 */
     public void payFromCard(double amount) {
         if(amount <= balance)
       {
             balance -= amount;
         System.out.println("Balance : "+balance);
       }
        else
         System.out.println("Sorry, your balance is too low!");
   }
     
     }
    
    
    
    
    
    
    
    
    
    
    
    
    

