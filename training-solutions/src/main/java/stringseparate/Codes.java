package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codes.size(); i++) {
            if (i != codes.size() - 1 && Character.isAlphabetic(codes.get(0).charAt(0))) {
                sb.append(codes.get(i));
                sb.append(", ");
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Codes c = new Codes();
        List<String> codes = new ArrayList<>();
        codes.add("T57fbj");
        codes.add("xtcu45");
        codes.add("f578GVHd");
        codes.add("57eezeze");

        System.out.println(Character.isAlphabetic(codes.get(0).charAt(0)));
        System.out.println(c.getCodesStartWithLetter(codes));

    }
}
