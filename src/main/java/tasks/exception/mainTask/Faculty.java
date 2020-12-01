package tasks.exception.mainTask;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<StudentsGroup>studentsGroups = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void addNewGroup(StudentsGroup group){
        studentsGroups.add(group);
        group.setFaculty(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentsGroups(List<StudentsGroup> studentsGroups) {
        this.studentsGroups = studentsGroups;
    }
    public List<StudentsGroup> getStudentsGroups() {
        return studentsGroups;
    }
}
