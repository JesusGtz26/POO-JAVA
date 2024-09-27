package org.generation;
import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("============================Datos de estudiantes=============================================");
		Student zoe = new Student("Zoe Elisa", "Rivera", 1000, 1, 2024);
		System.out.println(zoe);
		Student pedro = new Student("Pedro Antonio", "Garcia", 1001, 1, 2024);
		System.out.println(pedro);
		Student oscar = new Student("Oscar", "Hernandez", 1002, 1, 2024);
		System.out.println(oscar);
		System.out.println("===========================Nombre completo de estudiantes============================================");
		System.out.println(zoe.printFullName());
		System.out.println(pedro.printFullName());
		System.out.println(oscar.printFullName());
		
		
		Courses history = new Courses("history", "Andres", 2024);
		history.enroll(zoe);
		history.enroll(pedro);
		history.enroll(oscar);
		System.out.println("======================Cantidad de estudiantes inscritos en Historia============================================");
		System.out.println(history.countStudents());
		System.out.println("======================Lista de estudiantes============================================");
		
	}//main

}//class Main
