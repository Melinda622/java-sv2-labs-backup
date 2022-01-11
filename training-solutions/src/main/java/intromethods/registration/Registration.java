package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String writeName(String firstName,String lastName){
        return firstName+" "+lastName;
    }

    public LocalDate writeBirthDate(int year,int month,int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Registration registration=new Registration();
        Person person=new Person("John Doe", LocalDate.of(1974,11,11),"john.doe@gmail.com");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName= scanner.nextLine();
        System.out.println("Please enter your last name:");
        String lastName= scanner.nextLine();

        person.setName(registration.writeName(firstName,lastName));
        System.out.println(person.getName());

        System.out.println("Please enter your birth year:");
        int birthYear= scanner.nextInt();
        System.out.println("Please enter your birth month:");
        int birthMonth= scanner.nextInt();
        System.out.println("Please enter your birthday:");
        int birthDay= scanner.nextInt();
        scanner.nextLine();

        person.setDateOfBirth(registration.writeBirthDate(birthYear,birthMonth,birthDay));
        System.out.println(person.getDateOfBirth());

        System.out.println("Please enter your email:");
        String email= scanner.nextLine();
        person.setEmail(email);
        System.out.println(person.getEmail());

        System.out.println(person.toString());








    }
}
