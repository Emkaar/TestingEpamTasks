package tasks.exception.mainTask;

import java.util.Arrays;
import java.util.List;

public enum FacultyDisciplines {
    ARCHITECTURE(Arrays.asList(AcademicDiscipline.CONSTRUCTIONS,
            AcademicDiscipline.ENGLISH,
            AcademicDiscipline.HIGHER_MATHEMATICS,
            AcademicDiscipline.SELF_MANAGEMENT,
            AcademicDiscipline.SOFT_SKILLS,
            AcademicDiscipline.HYDRAULICS)),
    POWER_ENGINEERING(Arrays.asList(AcademicDiscipline.ELECTRICAL_ENGINEERING,
            AcademicDiscipline.ENGLISH,
            AcademicDiscipline.HIGHER_MATHEMATICS,
            AcademicDiscipline.SELF_MANAGEMENT,
            AcademicDiscipline.SOFT_SKILLS,
            AcademicDiscipline.ECOLOGY)),
    INFORMATION_TECHNOLOGY(Arrays.asList(AcademicDiscipline.COMPUTER_LANGUAGE,
            AcademicDiscipline.ENGLISH,
            AcademicDiscipline.HIGHER_MATHEMATICS,
            AcademicDiscipline.SELF_MANAGEMENT,
            AcademicDiscipline.SOFT_SKILLS,
            AcademicDiscipline.ALGORITHMS)),
    MANAGEMENT(Arrays.asList(AcademicDiscipline.PERSONNEL_MANAGEMENT,
            AcademicDiscipline.ENGLISH,
            AcademicDiscipline.HIGHER_MATHEMATICS,
            AcademicDiscipline.PERSONNEL_MANAGEMENT,
            AcademicDiscipline.SOFT_SKILLS,
            AcademicDiscipline.ANALYTICS,
            AcademicDiscipline.SELF_MANAGEMENT));

    private final List<AcademicDiscipline>facultyDisciplines;

    FacultyDisciplines(List<AcademicDiscipline> facultyDisciplines) {
        this.facultyDisciplines = facultyDisciplines;
    }

    public List<AcademicDiscipline> getFacultyDisciplines() {
        return facultyDisciplines;
    }
}
