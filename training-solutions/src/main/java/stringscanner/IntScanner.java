package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder("");

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i > 100) {
                sb.append(i);
                sb.append(",");
            }
        }

        String result = sb.toString();
        if (result.length() == 0) {
            return result;
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        String ints = "5;3;107;12;123;18;198";

        System.out.println(intScanner.convertInts(ints));
        System.out.println(intScanner.convertInts(""));
        System.out.println(intScanner.convertInts("200"));
        System.out.println(intScanner.convertInts("23"));
    }
}
