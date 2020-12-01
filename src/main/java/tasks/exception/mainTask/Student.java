package tasks.exception.mainTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String firstName;
    private String secondName;
    private Map<AcademicDiscipline, Integer> studentDisciplineMap = new HashMap<>();
    private String group;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(Map<AcademicDiscipline, Integer> studentDisciplineList) {
        this.studentDisciplineMap = studentDisciplineList;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Map<AcademicDiscipline, Integer> getStudentDisciplineMap() {
        return studentDisciplineMap;
    }

    public void passExamOfDiscipline(String discipline, Integer grade){
        studentDisciplineMap.put(AcademicDiscipline.valueOf(discipline.toUpperCase()), grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) &&
                secondName.equals(student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}
