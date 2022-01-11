package stringbasic.university;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();
        Person person1 = new Person("John Doe", "johndoe@gmail", "7373737", "797979328038", "7937237");
        Student student1 = new Student(person1, "FHFJ6JK", "2626262");

        Person person2 = new Person("John Doe", "johndoe@gmail", "7373737", "797979328038", "7937237");
        Student student2 = new Student(person2, "FHFJ6JK", "2626262");

        Person person3 = new Person("Jane Doe", "janedoe@gmail", "456667", "11111113445", "56889567");
        Student student3 = new Student(person3, "RTTGG78", "233444432");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.getStudents().get(0);
        university.getStudents().get(1);

        university.areEqual(university.getStudents().get(0), university.getStudents().get(1));
        university.areEqual(university.getStudents().get(1), university.getStudents().get(2));
    }
}
