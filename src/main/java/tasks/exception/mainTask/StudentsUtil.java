package tasks.exception.mainTask;

import java.util.ArrayList;
import java.util.List;

public class StudentsUtil {

    public static double getAverageGrade(Student student){
        List<Double>grades = new ArrayList<>();
        for(Integer grade : student.getStudentDisciplineMap().values()){
            if(grade != 0){
                grades.add((double)grade);
            }
        }
        return getAverageDouble(grades);
    }

    public static double getAverageDisciplineGradeOfGroup(StudentsGroup studentsGroup, AcademicDiscipline academicDiscipline){
        List<Double> grades = new ArrayList<>();
        for(Student student : studentsGroup.getStudentList()){
            if(student.getStudentDisciplineMap().containsKey(academicDiscipline)
               && student.getStudentDisciplineMap().get(academicDiscipline) != 0)
            {
                grades.add(Double.valueOf(student.getStudentDisciplineMap().get(academicDiscipline)));
            }
        }
        return getAverageDouble(grades);
    }

    public static Double getAverageDisciplineGradeOfGroup(AcademicDiscipline discipline) {
        List<Double> grades = new ArrayList<>();
        for (StudentsGroup group : University.getInstance().getUniversityGroups()) {
            if (getAverageDisciplineGradeOfGroup(group, discipline) != 0) {
                grades.add(getAverageDisciplineGradeOfGroup(group, discipline));
            }
        }
        return getAverageDouble(grades);
    }

    private static double getAverageDouble(List<Double> doubleList){
            return doubleList.stream().mapToDouble(a -> a).average().orElse(0.0);
    }
}
