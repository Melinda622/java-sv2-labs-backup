package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter a second number");
        int number2 = scanner.nextInt();
        System.out.println("What operation would you like to do?");
        String operation = scanner.next();

        if (operation.equalsIgnoreCase("addition")) {
            calculator.add(number1, number2);
        }
         else if (operation.equalsIgnoreCase("subtraction")) {
            calculator.subtract(number1, number2);
        }
        else if (operation.equalsIgnoreCase("multiplication")) {
            calculator.multiply(number1, number2);
        }

        try {
            if (operation.equalsIgnoreCase("division")) {
                calculator.divide(number1, number2);
            }
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide a number by zero!");
        }
    }
}
