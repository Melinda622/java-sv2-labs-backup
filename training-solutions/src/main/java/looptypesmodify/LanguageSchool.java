package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        System.out.println(students);

        Student student1 = new Student("John Carter");
        Student student2 = new Student("Vladimir Trockij");
        Student student3 = new Student("Kiss Töhötöm");
        Student student4 = new Student("Jane Sloane");
        Student student5 = new Student("Végh Béla");
        Student student6 = new Student("Jake Doe");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println(students.size());

        student5.setActive(false);
        student6.setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();

        for (Student s : students) {
            if (s.isActive() == false) {
                studentsToRemove.add(s);
            }
        }

        System.out.println(studentsToRemove);
        System.out.println(studentsToRemove.size());
        students.removeAll(studentsToRemove);

        System.out.println(students.size());
    }
}
