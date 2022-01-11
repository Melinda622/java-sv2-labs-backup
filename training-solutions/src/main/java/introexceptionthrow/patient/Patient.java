package introexceptionthrow.patient;

import java.util.Arrays;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        if (yearOfBirth <= 1990) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(ssn))
            throw new IllegalArgumentException("Invalid Social Security Number: " + ssn);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", "345678953", 1974);
        SsnValidator ssnValidator = new SsnValidator();
        System.out.println(ssnValidator.isValidSsn(patient.getSocialSecurityNumber()));
        System.out.println(ssnValidator.isValidSsn("345678954"));
        System.out.println(ssnValidator.isValidSsn("345a78953"));
        System.out.println(ssnValidator.isValidSsn("34567895"));
    }
}
