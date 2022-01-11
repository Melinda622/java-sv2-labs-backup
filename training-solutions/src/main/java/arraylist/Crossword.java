package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {

        List<String> crosswords = new ArrayList<>();

        crosswords.add("KULCS");
        crosswords.add("KÁLYHA");
        crosswords.add("LÓ");
        crosswords.add("AJTÓ");
        crosswords.add("CSERESZNYEFA");
        crosswords.add("TEJ");
        crosswords.add("FELHŐ");
        crosswords.add("CIPŐ");
        crosswords.add("MOSODA");
        crosswords.add("KÁVÉTEJSZÍN");
        crosswords.add("CITERA");
        crosswords.add("BABA");

        System.out.println(crosswords);

        System.out.println("Here are the six letter words:");
        for (int i = 0; i < crosswords.size(); i++) {
            if (crosswords.get(i).length() == 6) {
                System.out.println(crosswords.get(i));
            }
        }
    }
}
