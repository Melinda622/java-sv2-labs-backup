package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void areEqual(Student student, Student anotherStudent) {
        String code1 = student.getNeptunCode();
        String code2 = anotherStudent.getNeptunCode();
        String id1 = student.getStudentId();
        String id2 = anotherStudent.getStudentId();
        if (code1.equals(code2) && id1.equals(id2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
