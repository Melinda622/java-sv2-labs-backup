package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text) {
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isWhitespace(letters[i])) {
                letters[i] = '*';
            }
        }
        String s = new String(letters);
        return s;
    }

    public static void main(String[] args) {
        Whitespace white = new Whitespace();

        System.out.println(white.makeWhitespaceToStar("Hello Bello    "));
    }
}
