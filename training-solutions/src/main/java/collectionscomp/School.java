package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        Student student1 = new Student("Nagy László", 189);
        Student student2 = new Student("Ábel János", 167);
        Student student3 = new Student("Kürtös Károly", 150);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

        studentsMap.put(student1.getName(), student1.getHeight());
        studentsMap.put(student2.getName(), student2.getHeight());
        studentsMap.put(student3.getName(), student3.getHeight());

        System.out.println(studentsMap);
    }
}
