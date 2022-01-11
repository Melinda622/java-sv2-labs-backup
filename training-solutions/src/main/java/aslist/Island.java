package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("book", "pen", "phone");
        System.out.println("You can take three items with you to a deserted island. Your objects so far are the following: " + importantThings);

        System.out.println("If you changed your mind, which item would you like to leave at home and take another object instead? (enter the index number)");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What would you like to take instead?");
        String newItem = scanner.nextLine();

        importantThings.set(index, newItem);
        System.out.println("The objects you will take to the island: " + importantThings);
    }
}
