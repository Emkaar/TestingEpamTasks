package tasks.exception.mainTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class StudentsUtilTest {
    University university = University.getInstance();
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    @Before
    public void createUniversity() {
            student1 = new Student("Anna", "Dontcova");
            student2 = new Student("Konstantin", "Kozhevnikov");
            student3 = new Student("Michael", "Petrov");
            student4 = new Student("Jhon", "Travolta");
            student5 = new Student("Petr", "First");
                StudentsGroup group1 = new StudentsGroup("a1", 1,
                        Arrays.asList(AcademicDiscipline.HIGHER_MATHEMATICS, AcademicDiscipline.HYDRAULICS, AcademicDiscipline.ENGLISH));
                StudentsGroup group2 = new StudentsGroup("a4", 4,
                        Arrays.asList(AcademicDiscipline.HIGHER_MATHEMATICS, AcademicDiscipline.ELECTRICAL_ENGINEERING, AcademicDiscipline.ENGLISH));
                StudentsGroup group3 = new StudentsGroup("it2", 2,
                        Arrays.asList(AcademicDiscipline.ALGORITHMS, AcademicDiscipline.ANALYTICS, AcademicDiscipline.ENGLISH));
                group1.addStudent(student1);
                group1.addStudent(student2);
                group2.addStudent(student3);
                group3.addStudent(student4);
                group3.addStudent(student5);
                Faculty faculty1 = new Faculty("Architect");
                Faculty faculty2 = new Faculty("IT");
                faculty1.addNewGroup(group1);
                faculty1.addNewGroup(group2);
                faculty2.addNewGroup(group3);
                university.addUniversityFaculty(faculty1);
                university.addUniversityFaculty(faculty2);
                student1.passExamOfDiscipline("higher_mathematics", 9);
                student1.passExamOfDiscipline("hydraulics", 6);
                student1.passExamOfDiscipline("english", 6);
    }

    @Test
    public void getStudentAverageGradeTest(){
        double result = StudentsUtil.getStudentAverageGrade(student1);
        Assert.assertEquals(7, result, 0.5);
    }



}
