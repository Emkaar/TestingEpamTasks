package tasks.exception.mainTask;

import tasks.exception.mainTask.exceptions.NoGroupsOnFacultyException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentsUtil {

    public static double getStudentAverageGrade(Student student){
        List<Double>grades = new ArrayList<>();
        for(Integer grade : student.getStudentDisciplineMap().values()){
            if(grade != 0){
                grades.add((double)grade);
            }
        }
        return getAverageDouble(grades);
    }

    public static Double getAverageDisciplineGradeOfGroupOnFaculty(String discipline,
                                                                   String faculty,
                                                                   String group) {
        List<Double> grades = new ArrayList<>();
        StudentsGroup neededGroup = University.getInstance().getUniversityFaculties().stream().filter(f -> f.getName().
                equals(faculty)).findFirst().get().getStudentsGroups().stream().filter(g -> g.getId().equals(group)).findFirst().get();

        for (Student student : neededGroup.getStudentList()){
            if(student.getStudentDisciplineMap().keySet().contains(AcademicDiscipline.valueOf(discipline.toUpperCase()))){
                if(student.getStudentDisciplineMap().get(AcademicDiscipline.valueOf(discipline.toUpperCase())) != 0){
                    grades.add((double)student.getStudentDisciplineMap().get(AcademicDiscipline.valueOf(discipline.toUpperCase())));
                }
            }
        }
        return getAverageDouble(grades);
    }

    public static Double getAverageDisciplineGradeOfUniversity(String discipline){
        return University.getInstance().getUniversityFaculties().stream()
                .flatMap(faculty -> faculty.getStudentsGroups().stream()).collect(Collectors.toList())
                .stream().flatMap(studentsGroup -> studentsGroup.getStudentList().stream())
                .filter(s -> (s.getStudentDisciplineMap().keySet()
                .contains(AcademicDiscipline.valueOf(discipline.toUpperCase()))
                        && s.getStudentDisciplineMap()
                .get(AcademicDiscipline.valueOf(discipline.toUpperCase())) != 0))
                .collect(Collectors.toList()).stream().map(student -> (double) student.getStudentDisciplineMap()
                .get(AcademicDiscipline.valueOf(discipline.toUpperCase())))
                .mapToDouble(d -> d).average().orElse(0.0);
    }

    private static double getAverageDouble(List<Double> doubleList){
            return doubleList.stream().mapToDouble(a -> a).average().orElse(0.0);
    }
}
