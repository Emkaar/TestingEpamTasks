package tasks.exception.mainTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentsGroup {
    private String id;
    private Integer course;
    private List<Student> studentList = new ArrayList<>();
    private List<AcademicDiscipline>groupDisciplines = new ArrayList<>();
    private String faculty;
    public StudentsGroup() {
    }

    public StudentsGroup(String id, Integer course) {
        this.id = id;
        this.course = course;
    }

    public StudentsGroup(String id, Integer course, List<AcademicDiscipline> groupDisciplines) {
        this.id = id;
        this.course = course;
        this.groupDisciplines = groupDisciplines;
    }

    public void addDiscipline(AcademicDiscipline discipline){
        groupDisciplines.add(discipline);
    }

    public void addStudent(Student student){
        studentList.add(student);
        student.setGroup(this.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<AcademicDiscipline> getGroupDisciplines() {
        return groupDisciplines;
    }

    public void setGroupDisciplines(List<AcademicDiscipline> groupDisciplines) {
        this.groupDisciplines = groupDisciplines;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsGroup that = (StudentsGroup) o;
        return id.equals(that.id) &&
                course.equals(that.course) &&
                Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, faculty);
    }
}
