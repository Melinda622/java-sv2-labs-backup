package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (titles.indexOf(title) >= 0) {
            System.out.println(author + ": " + title);
        }
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Books book1 = new Books();

        book1.addBook("Egri Csillagok");
        System.out.println(book1.getTitles());

        book1.addBook("A kőszívű ember fiai");
        System.out.println(book1.getTitles());

        book1.findBookAndSetAuthor("Egri Csillagok", "Gárdonyi Géza");
    }
}
