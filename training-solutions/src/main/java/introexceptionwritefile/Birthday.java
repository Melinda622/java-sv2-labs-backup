package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public List<String> createBirthdayList() {

        List<String> birthdayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the number of birthdays you wish to store:");
        int numberOfItems = scanner.nextInt();
        String s;

        s = scanner.nextLine();

        System.out.println("Please add the birthdays of the people you wish to store:");
        for (int i = 0; i < numberOfItems; i++) {
            birthdayList.add(scanner.nextLine());
        }
        return birthdayList;
    }

    public void printBirthdayList() {

        try {
            Files.write(Paths.get("src/main/java/introexceptionwritefile/birthdaylist.txt"), createBirthdayList());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Birthday birthday = new Birthday();
        birthday.printBirthdayList();
    }
}
