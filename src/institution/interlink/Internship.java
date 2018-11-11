package institution.interlink;

import person.Student;

public class Internship {
    private String name;
    private Student student;
    private University university;
    private float sum;

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //lets take that those who has >= 3 level of knowledge are able to get internship
    public void getStudents(University university) {
    	for (Student var : university.students) {
    		sum += var.getKnowledge().getLevel();
    	}
        for (Student var : university.students) {

            if(var.getKnowledge().getLevel() >= sum/(university.students.size())){
            	university.intern.add(var.getName());


            }
        }
    }

    public void getIntern(University university) {
    	Object[] peopleArray = university.intern.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}
