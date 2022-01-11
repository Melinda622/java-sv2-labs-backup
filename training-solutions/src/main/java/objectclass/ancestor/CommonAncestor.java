package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();

        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Starking starking = new Starking();
        Vegetable vegetable = new Vegetable();

        objects.add(fruit);
        objects.add(apple);
        objects.add(starking);
        objects.add(vegetable);
        objects.add("alma");
        objects.add(12);
        objects.add("x");

        LocalDate date = LocalDate.now();
        objects.add(date);

        int[] arr = new int[3];
        objects.add(arr);

        List<String> words = new ArrayList<>();
        objects.add(words);

        System.out.println(objects);
    }
}
