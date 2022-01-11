package controlselection.accents;

public class WithoutAccents {
    public char convertToCharWithoutAccents(char c) {
        char result;
        switch (c) {
            case 'á':
                result = 'a';
                break;
            case 'Á':
                result = 'A';
                break;
            case 'é':
                result = 'e';
                break;
            case 'É':
                result = 'E';
                break;
            case 'í':
                result = 'i';
                break;
            case 'Í':
                result = 'I';
                break;
            case 'ó', 'ö', 'ő':
                result = 'o';
                break;
            case 'Ö', 'Ő', 'Ó':
                result = 'O';
                break;
            case 'ú', 'ü', 'ű':
                result = 'u';
                break;
            case 'Ú', 'Ű', 'Ü':
                result = 'U';
                break;
            default:
                result = c;
        }
        return result;
    }
}
