package institution.interlink;

import person.Student;

public class Internship {
    private String name;
    private Student student;
    private University university;

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //lets take that those who has >= 3 level of knowledge are able to get internship
    public String getStudents(University university) {
        StringBuilder studentsWithOp = new StringBuilder("");
        for (Student var : university.students) {
            if(var.getKnowledge().getLevel() >= 3){
                studentsWithOp.append(var.getName() + "\n");
            }
        }
        return studentsWithOp.toString();
    }
}