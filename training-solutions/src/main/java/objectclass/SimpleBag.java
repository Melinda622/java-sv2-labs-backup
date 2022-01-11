package objectclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleBag {

    private int cursor;

    private List<Object> items = new ArrayList<>();

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public boolean contains(Object item) {
        for (Object o : items) {
            return item.equals(o);
        }
        return false;
    }

    public boolean hasNext() {

        return !items.isEmpty() || cursor < (items.size() - 1);

    }

    public void beforeFirst() {
        this.cursor = -1;
    }

    public int getCursor() {
        return cursor;
    }

    public Object next() {
        cursor++;
        return items.get(cursor);
    }
}
