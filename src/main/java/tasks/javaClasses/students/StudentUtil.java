package tasks.javaClasses.students;

import java.util.Calendar;

public class StudentUtil {
    private Student[] students;

    public StudentUtil(Student[] students) {
        this.students = students;
    }

    public void showAllStudentsOfFaculty(Faculty faculty){
        for (Student student : students){
            if(student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    public void showAllStudentsOfFacultyAndCourse(Faculty faculty, int course){
        for (Student student : students){
            if(student.getFaculty().equals(faculty) && student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public void showAllStudentsWhoWasBornAfterYear(int year){
        for (Student student : students){
            if(student.getBornDate().get(Calendar.YEAR) > year) {
                System.out.println(student);
            }
        }
    }

    public void showAllStudentsOfGroup(String group){
        for (Student student : students){
            if(student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }
}
