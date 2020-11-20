package tasks.javaClasses.students;

public class MainStudents {
    public static void main(String[] args) {
        StudentUtil studentUtil = new StudentUtil(
                new Student[]{new Student(1, "Jhon", "Smith", 6, 7, 1992, "SaintPetersburg, Nepokorennuh avenue, 49",
                    "89158887262", Faculty.ARCHITECTURE, 6, "6.1.A"),
                new Student(2, "Jake", "Smith", 6, 7, 1995, "SaintPetersburg, Grazhdanskiy avenue, 121",
                    "89111009188", Faculty.INFORMATION_TECHNOLOGY, 4, "6.1.IT"),
                new Student(3, "Katerine", "Pozdnyakova", 17, 9, 1993, "Moskovskaya street, 14",
                    "89918827774", Faculty.ARCHITECTURE, 6, "6.1.A"),
                new Student(3, "Liza", "Korovaeva", 11, 9, 1997, "Rainbow street, 65",
                    "89995155156", Faculty.MANAGEMENT, 2, "2.2.M")});

        studentUtil.showAllStudentsWhoWasBornAfterYear(1993);
        System.out.println("---");
        studentUtil.showAllStudentsOfFaculty(Faculty.INFORMATION_TECHNOLOGY);
        System.out.println("---");
        studentUtil.showAllStudentsOfGroup("6.1.A");
        System.out.println("---");
        studentUtil.showAllStudentsOfFacultyAndCourse(Faculty.ARCHITECTURE, 6);
    }
}
