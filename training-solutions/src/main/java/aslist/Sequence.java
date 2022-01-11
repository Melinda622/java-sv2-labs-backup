package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList(Arrays.asList(1, 2));
        System.out.println(elements.size());
        //System.out.println(doors);
        for (int i = 2; i < 5; i++) {
            int x = elements.get(i - 1) * elements.get(i - 2);
            elements.add(x);
        }
        System.out.println(elements);
        System.out.println("Size of the list: " + elements.size());
    }
}
