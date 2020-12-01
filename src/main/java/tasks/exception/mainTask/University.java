package tasks.exception.mainTask;

import java.util.HashSet;
import java.util.Set;

public class University {
    private static University INSTANCE;
    private Set<Faculty>universityFaculties;
    private University(){
        universityFaculties = new HashSet<>();
    }

    public static University getInstance(){
        if(INSTANCE == null){
            INSTANCE = new University();
        }
        return INSTANCE;
    }

    public void addUniversityFaculty(Faculty faculty){
        universityFaculties.add(faculty);
    }

    public Set<Faculty> getUniversityFaculties() {
        return universityFaculties;
    }

    public void setUniversityFaculties(Set<Faculty> universityFaculties) {
        this.universityFaculties = universityFaculties;
    }
}
