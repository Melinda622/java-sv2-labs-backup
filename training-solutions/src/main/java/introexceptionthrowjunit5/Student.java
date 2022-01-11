package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Integer> grades = new ArrayList<>();

    public void addGrade(int grade) {
        if (grade >= 1 && grade <= 5) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 1 and 5!");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
