package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Your name cannot be empty!");
        } else {
            this.name = name;
        }
        this.socialSecurityNumber = socialSecurityNumber;

        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Your year of birth must be at least 1900!");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
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

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient patient=new Patient("John Doe", "223555567",1974);
        //Patient patient2=new Patient("", "223555567",1974);
        //Patient patient3=new Patient("Jane Doe", "223555567",1874);
        System.out.println(patient);
    }
}
