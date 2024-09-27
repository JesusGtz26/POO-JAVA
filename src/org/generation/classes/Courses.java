package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	
	public Courses (String courseName, String professorName, int year) {
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
	}//constructor
	
	List<Student> enrolledStudents = new ArrayList<Student>();
	
	 public void enroll(Student student){
	      //TODO add the student to the collection
		enrolledStudents.add(student);
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   enrolledStudents.remove(student);
	   }

	   public int countStudents(){
	       //TODO implement
		   
	       return enrolledStudents.size();
	   }
	   
	   public int bestGrade(){
	       //TODO implement
	       return 0;
	   }
	   
	   public void enroll(Student[] students){
		      //TODO add all the students to the collection
		   }//allStudents
}//class Courses
