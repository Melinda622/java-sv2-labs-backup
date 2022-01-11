package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        char[] characters = text.toCharArray();
        for (char i : characters) {
            if (Character.isAlphabetic(i)) {
                System.out.println(i + ": Ez egy betű");
            } else if (Character.isDigit(i)) {
                System.out.println(i + ": Ez egy szám");
            } else {
                System.out.println(i + ": egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits letter = new LettersAndDigits();

        letter.printLetterOrDigit("jshDAC6dh;:8");
    }
}
