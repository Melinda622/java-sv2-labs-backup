package stringbasic.university;

public class Student {
    private Person person;
    private String neptunCode;
    private String studentId;
    private String accessCardNumber;

    public Student(Person person, String neptunCode, String studentId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.studentId = studentId;
    }

    public Person getPerson() {
        return person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAccessCardNumber() {
        return accessCardNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAccessCardNumber(String accessCardNumber) {
        this.accessCardNumber = accessCardNumber;
    }
}
