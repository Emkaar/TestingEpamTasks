package tasks.javaClasses.students;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Student {
    int id;
    String firstName;
    String secondName;
    Calendar bornDate = new GregorianCalendar();
    String address;
    String phoneNumber;
    Faculty faculty;
    int course;
    String group;

    public Student() {
    }

    public Student(int id, String firstName, String secondName, int day,int month, int year, String address, String phoneNumber, Faculty faculty, int course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        bornDate.set(Calendar.DAY_OF_MONTH, day);
        bornDate.set(Calendar.MONTH, month);
        bornDate.set(Calendar.YEAR, year);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Calendar getBornDate() {
        return bornDate;
    }

    public void setBornDate(Calendar bornDate) {
        this.bornDate = bornDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName);
    }
}
