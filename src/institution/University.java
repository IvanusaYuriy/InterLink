package institution;

import person.Student;

import java.util.*;

public class University {
    private String name;
    public ArrayList<Student> students;
    public ArrayList<String> intern;
    private Student student;

    public University(String name) {
        students = new ArrayList<Student>();
	intern = new ArrayList<String>();
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

