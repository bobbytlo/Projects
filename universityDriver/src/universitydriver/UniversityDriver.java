/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydriver;

/**
 *
 * @author HP Spectre x360
 */
public class UniversityDriver {


        
    public static void main(String[] args) {
        // TODO code application logic here
        
//Student maria = new Student("Maria", 'L', "Garces", "800555555", 19, true);
//System.out.println(maria.firstName);
//System.out.println(maria.middleInitial);
//System.out.println(maria.lastName);
//System.out.println(maria.studentID);
//System.out.println(maria.age);
//System.out.println(maria.liveOnCampus);

Student torrance = new Student("Torrance", 'J', "DeLeon", "800234567", 19, false);
System.out.println("Object torrance first name is " + torrance.getFirstName());   

torrance.setFirstName("Michel");   
System.out.println("Object torrance first name is "+ torrance.getFirstName());

torrance.setFirstName("K");   
System.out.println("Object torrance middle name is "+ torrance.getMiddleInitial());
    
torrance.setLastName("Johnson");   
System.out.println("Object torrance last name is "+ torrance.getLastName());

torrance.setStudentID("80071717");   
System.out.println("Object torrance student ID is "+ torrance.getStudentID());
    
torrance.setAge(20);   
System.out.println("Object torrance age is "+ torrance.getAge());
    
torrance.setLiveOnCampus(true);   
System.out.println("Object torrance lives on campus is "+ torrance.getLiveOnCampus());
    
torrance.transferToCard(400.0);
torrance.transferToCard(150.0);
torrance.payFromCard(100.0);
torrance.payFromCard(50.0);
torrance.payFromCard(-200.0);

    }
}
