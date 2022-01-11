package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word to be spelled:");
        String wordToBeSpelled = scanner.nextLine();

        System.out.println("Please spell the following word: " + wordToBeSpelled);
        char[] letters = new char[wordToBeSpelled.length()];
        for (int i = 0; i < wordToBeSpelled.length(); i++) {
            System.out.println("Please enter the " + i + 1 + ". " + "letter");
            letters[i] = scanner.next().charAt(0);
        }

        String s = new String(letters);
        System.out.println("You spelled the following word: " + s);
        if (s.equals(wordToBeSpelled)) {
            System.out.println("Cogratulations! You spelled the word: " + wordToBeSpelled + "correctly.");
        } else {
            System.out.println("Unfortunately you could not spell the word: " + wordToBeSpelled + " correctly.");
        }
        System.out.println(s.equals(wordToBeSpelled));
    }
}
