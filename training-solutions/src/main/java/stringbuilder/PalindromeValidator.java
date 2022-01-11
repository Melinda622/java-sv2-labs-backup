package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        word = word.trim();
        StringBuilder palindrome = new StringBuilder(word);
        return word.equalsIgnoreCase(palindrome.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator validator = new PalindromeValidator();

        String s = "hello";
        String t = "KAYAK";
        String v = "  racecar  ";

        System.out.println(validator.isPalindrome(t));
        System.out.println(validator.isPalindrome(s));
        System.out.println(validator.isPalindrome(v));
    }
}
