package collectionsiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChristmasShopping {

    List<ChristmasPresent> presents = new LinkedList<>();

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> i = presents.iterator();

        while (i.hasNext()) {
            ChristmasPresent j = i.next();
            System.out.println(j);
            if (j.getPrice() > maxPrice) {
                i.remove();
            }
        }
    }
}
