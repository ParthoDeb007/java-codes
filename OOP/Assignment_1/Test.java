//4.4

import StudentApp.Student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Jonh Blue", 85.5);
        Student student2 = new Student("Jane Green", 92.0);

        System.out.println("%s's letter grade is: %s".formatted(student1.getName(), student1.getLetterGrade()));
        System.out.println("%s's letter grade is: %s".formatted(student2.getName(), student2.getLetterGrade()));
    }
}
