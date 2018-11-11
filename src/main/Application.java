package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.*;
public class Application {
    public static void main(String[] args) {
    	Student student1 = new Student("Andrew Kostenko", new Knowledge(2));
    	Student student2 = new Student("Julia Veselkina", new Knowledge(3));
    	Student student3 = new Student("Maria Perechrest", new Knowledge(4));
        University university = new University("CH.U.I.");
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        Internship internship = new Internship("Interlink");
        internship.getStudents(university);
        internship.getIntern(university);
       
 
        
    }
}
