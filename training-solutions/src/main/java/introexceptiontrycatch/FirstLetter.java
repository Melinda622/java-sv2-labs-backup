package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Lorem", "ipsum", "dolor", "sit", "amet", "consetetur", "sadipscing", "elitr", null));

        try {
            for (String s : words) {
                System.out.println(s.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println("A lista ez az eleme null, ezért nem lehet rajta lefuttatni a programot.");
        }
    }
}
