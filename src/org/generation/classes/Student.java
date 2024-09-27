package org.generation.classes;

public class Student {
    public String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student (String firstName, String lastName, int registration, int grade, int year) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.registration=registration;
		this.grade=grade;
		this.year=year;
	}//constructor
    
    public Student(String firstName, String lastName, int year) {
    	this(firstName, lastName, 0000, 9, year);
    }//constructor
    
    public Student(String lastName, int registration) {
    	this("Estudiante", lastName, registration);
    }//constructor
    
    public Student(String firstName, int grade, String lastName) {
    	this(firstName, lastName, grade);
    }//constructor
    
    public String toString() {
		return "firstName=" + this.firstName + ", lastName=" + this.lastName 
				+ ", " + this.registration + ", " + this.grade + ", " + this.year;
	}//toString para Students (lo implemente para que fuera mas facil saber la inf. de un estudiante)
    
    public String printFullName(){
        //TODO implement
    	return "Nombre completo del alumno: " + this.firstName + " " + this.lastName;
     }//printFullName

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (grade >=60) {
    		 return true;
    	 }else {
    		 return false;
    	 }
    	 
     }//isApproved

     public void changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 if (isApproved()) {
    		 this.year=year+1;
    		 System.out.println("Felicitaciones, paseste al siguiente grado");
    	 }else {
    		 System.out.println("Reprobaste el año, pasa a control escolar");
    	 }//changeYearIfApproved
         
     }//changeYearIfApproved
}//class Student

