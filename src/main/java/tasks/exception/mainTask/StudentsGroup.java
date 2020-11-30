package tasks.exception.mainTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentsGroup {
    private Integer course;

    private List<Student> studentList = new ArrayList<>();

    public StudentsGroup(Integer course, FacultyDisciplines groupFacultyDisciplines) {
        this.course = course;
        this.groupFacultyDisciplines = groupFacultyDisciplines;
    }

    public void addStudentInGroup(Student student){
        student.addDisciplinesOfFaculty(groupFacultyDisciplines.getFacultyDisciplines());
        studentList.add(student);
    }

    public Integer getCourse() {
        return course;
    }

    public FacultyDisciplines getGroupFaculty() {
        return groupFacultyDisciplines;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsGroup that = (StudentsGroup) o;
        return course.equals(that.course) &&
                groupFacultyDisciplines == that.groupFacultyDisciplines;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, groupFacultyDisciplines);
    }
}
