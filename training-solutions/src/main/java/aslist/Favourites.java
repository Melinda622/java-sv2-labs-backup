package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        System.out.println(favouriteThings);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favourite animal?");
        String item = scanner.nextLine();
        favouriteThings.add(item);

        System.out.println("What is your favourite movie?");
        String item2 = scanner.nextLine();
        favouriteThings.add(item2);

        System.out.println("Who is your favourite actor?");
        String item3 = scanner.nextLine();
        favouriteThings.add(item3);

        System.out.println(favouriteThings);
        System.out.println("Size of the list: " + favouriteThings.size());
    }
}




