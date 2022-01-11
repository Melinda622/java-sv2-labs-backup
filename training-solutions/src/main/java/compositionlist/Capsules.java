package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public List<String> getColors() {
        return colors;
    }

    public void addLast(String color) {
        colors.add(colors.size(), color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size() - 1);
    }

    public static void main(String[] args) {
        Capsules capsule1 = new Capsules();
        System.out.println(capsule1.getColors());

        List<String> dogs = new ArrayList<>();
        dogs.add("yorkie");
        System.out.println(dogs);
        System.out.println(dogs.size());
        dogs.add(dogs.size(), "mops");
        System.out.println(dogs);

        dogs.remove(1);
        System.out.println(dogs);

        capsule1.addLast("pink");
        System.out.println(capsule1.getColors());

        capsule1.addLast("black");
        System.out.println(capsule1.getColors());

        capsule1.addFirst("blue");
        System.out.println(capsule1.getColors());

        capsule1.removeLast();
        System.out.println(capsule1.getColors());

        capsule1.removeFirst();
        System.out.println(capsule1.getColors());
    }
}
