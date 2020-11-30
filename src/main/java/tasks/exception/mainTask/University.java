package tasks.exception.mainTask;

import java.util.HashSet;
import java.util.Set;

public class University {
    private static University INSTANCE;

    private Set<FacultyDisciplines>universityFaculties;
    private University(){
        universityFaculties = new HashSet<>();
    }

    public static University getInstance(){
        if(INSTANCE == null){
            INSTANCE = new University();
        }
        return INSTANCE;
    }

    public void addUniversityGroup(StudentsGroup studentsGroup){
        universityFaculties.add(studentsGroup);
    }

    public Set<Faculty> getUniversityGroups() {
        return universityFaculties;
    }
}
