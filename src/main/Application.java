package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(3)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(4)));

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents(university));
    }
}
