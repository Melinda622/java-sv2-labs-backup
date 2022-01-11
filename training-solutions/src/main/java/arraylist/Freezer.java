package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    private List<String> items = new ArrayList<>();

    public void addToFreezer(String food) {
        items.add(food);
    }

    public void removeFromFreezer(int index) {
        items.remove(index);
    }

    public List<String> getItems() {
        return items;
    }

    public static void main(String[] args) {

        Freezer freezer = new Freezer();

        freezer.addToFreezer("ice cream");
        freezer.addToFreezer("pizza");
        freezer.addToFreezer("vegetables");
        freezer.addToFreezer("fruits");
        freezer.addToFreezer("meat");

        System.out.println(freezer.getItems());
        System.out.println(freezer.getItems().size());

        freezer.removeFromFreezer(4);
        freezer.removeFromFreezer(3);

        System.out.println(freezer.getItems());
        System.out.println(freezer.getItems().size());
    }
}

