package tasks.exception.mainTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String firstName;
    private String secondName;
    private Map<AcademicDiscipline, Integer> studentDisciplineMap = new HashMap<>();

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(Map<AcademicDiscipline, Integer> studentDisciplineList) {
        this.studentDisciplineMap = studentDisciplineList;
    }

    public Student() {
    }

    public void addAcademicDiscipline(AcademicDiscipline academicDiscipline, Integer grade){
        studentDisciplineMap.put(academicDiscipline, grade);
    }

    public void addDisciplinesOfFaculty(List<AcademicDiscipline>facultyDisciplines){
        for (AcademicDiscipline academicDiscipline : facultyDisciplines){
            studentDisciplineMap.put(academicDiscipline, 0);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Map<AcademicDiscipline, Integer> getStudentDisciplineMap() {
        return studentDisciplineMap;
    }
}
