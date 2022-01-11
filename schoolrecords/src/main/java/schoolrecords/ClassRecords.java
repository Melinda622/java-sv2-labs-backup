package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return true;
            }
        }
        students.remove(student);
        return false;
    }

    public double calculateClassAverage() {
        double sum = 0;
        double average = 0;

        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        for (Student s : students) {
            sum += s.calculateAverage();
            if (s.getGrades().isEmpty()) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
        average = sum / students.size();
        average = Math.round(average * 100);
        average = average / 100;
        return average;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        double average = 0;
        int count = 0;
        if (students.isEmpty()) {
            return 0.0;
        }
        for (Student s : students) {
            if (s.calculateSubjectAverage(subject) > 0) {
                sum += s.calculateSubjectAverage(subject);
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        average = sum / count;
        return average;
    }

    public Student findStudentByName(String name) {
        Student result = null;
        if (name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                result = s;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("Student by this name cannot be found!" + " " + name);
        }
        return result;
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(0, students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student s : students) {
            result.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < students.size(); i++) {
            if (i == (students.size() - 1)) {
                sb.append(students.get(i).getName());
            } else {
                sb.append(students.get(i).getName()).append(", ");
            }
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public List<Student> getStudents() {
        return students;
    }
}
