package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {

        Set<Integer> result = new TreeSet<>();

        for (Student s : students) {
            result.add(s.getHeight());
        }

        return result;
    }

    public static void main(String[] args) {

        PhysicalEducation physicalEducation = new PhysicalEducation();

        List<Student> students = Arrays.asList(new Student("John Doe", 150), new Student("Jane Doe", 140), new Student("James Doe", 160));
        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
