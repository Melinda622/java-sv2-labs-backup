package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 3;

        while (number % 2 == 1) {
            try {
                System.out.println("Please enter a number!");
                number = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number!");
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}
