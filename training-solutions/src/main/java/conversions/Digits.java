package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void addDigitsToList(String text) {
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isDigit(characters[i])) {
                String s = Character.toString(characters[i]);
                int num = Integer.parseInt(s);
                list.add(num);
            }
        }
    }

    public static void main(String[] args) {
        Digits digit = new Digits();

        digit.addDigitsToList("h3e34ll8o");
        System.out.println(digit.getList());
    }

}
