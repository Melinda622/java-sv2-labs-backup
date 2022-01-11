package primitivetypes.exam;

import java.util.List;
import java.util.ArrayList;

public class Exam {
    private List<Person> students = new ArrayList<>();

    public void add(Person person) {
        students.add(person);
    }

    public List<Person> getStudents() {
        return students;
    }
}