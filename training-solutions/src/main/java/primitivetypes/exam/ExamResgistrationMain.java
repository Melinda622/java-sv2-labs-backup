package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamResgistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please follow the instructions below to register to the exam!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Pleas enter your birthdate(format: YEAR-MM-DD): ");
        String birthDate = scanner.nextLine();

        System.out.println("Please enter your zip code:");
        String zip = scanner.nextLine();

        System.out.println("Please enter your grade average:");
        String grades = scanner.nextLine();

        LocalDate birthDate2 = LocalDate.parse(birthDate);
        int zip2 = Integer.parseInt(zip);
        Double grades2 = Double.valueOf(grades);

        Person person = new Person(name, birthDate2, zip2, grades2);
        Exam exam = new Exam();
        exam.add(person);

        System.out.println("Your registration to the exam was successful!");
        System.out.println("Your registered with the following data: " + exam.getStudents());
    }
}

