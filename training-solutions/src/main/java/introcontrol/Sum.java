package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a " + (i + 1) + "." + "integer!");
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Total: " + sum);
    }
}
