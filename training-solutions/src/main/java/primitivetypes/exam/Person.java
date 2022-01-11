package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double grades;

    @Override
    public String toString() {
        return
                "name: " + name + '\'' +
                        ", dateOfBirth: " + dateOfBirth +
                        ", zipCode: " + zipCode +
                        ", grades: " + grades +
                        '}';
    }

    public Person(String name, LocalDate dateOfBirth, int zipCode, double grades) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getGrades() {
        return grades;
    }
}
