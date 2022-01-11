package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word(max 5 letters)");
        String word = scanner.nextLine();

        if (word.length() > 5) {
            throw new IllegalArgumentException("The word you entered is too long!");
        }

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                throw new IllegalArgumentException("The word you entered contains not only letters!");
            }
        }
        System.out.println(word);
    }
}
