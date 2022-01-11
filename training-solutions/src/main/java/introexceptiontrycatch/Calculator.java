package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter a second number");
        int number2 = scanner.nextInt();
        System.out.println("What operation would you like to do?");
        String operation = scanner.next();

        if (operation.equalsIgnoreCase("addition")) {
            System.out.println(number1 + number2);
        } else if (operation.equalsIgnoreCase("subtraction")) {
            System.out.println(number1 - number2);
        } else if (operation.equalsIgnoreCase("multiplication")) {
            System.out.println(number1 * number2);
        }

        try {
            if (operation.equalsIgnoreCase("division")) {
                System.out.println(number1 / number2);
            }
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide a number by zero!");
        }
    }
}
