package chars;

public class Words {
    public String pushWord(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] += 1;
        }
        String s = new String(letters);
        return s;
    }

    public static void main(String[] args) {
        Words word = new Words();
        System.out.println(word.pushWord("hello"));
    }
}
