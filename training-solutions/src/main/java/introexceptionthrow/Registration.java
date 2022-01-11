package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name!");
        String name = scanner.nextLine();

        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        System.out.println(name);

        System.out.println("Please enter your age!");

        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            validation.validateName(name);
            validation.validateAge(age);
            System.out.println("Your registration was successful! name: " + name + " age: " + age);

        } catch(IllegalArgumentException iae) {
            System.out.println("Your registration was unsuccessful!");
        }
    }
}
