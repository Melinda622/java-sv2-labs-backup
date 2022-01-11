package controlselection.consonant;

public class ToConsonant {

    public char convertToConsonant(char c) {
        char result;
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                result = (char) (c + 1);
                break;
            default:
                result = c;
        }
        return result;
    }
}
