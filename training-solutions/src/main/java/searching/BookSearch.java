package searching;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<String> read(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file");
        }
        return lines;
    }

    public List<Book> transform(Path path) {
        String[] temp;
        for (String s : read(path)) {
            temp = s.split(";");
            int id = Integer.parseInt(temp[0]);
            String title = temp[1];
            String author = temp[2];
            books.add(new Book(id, title, author));
        }
        return books;
    }

    public Book findBookByAuthorTitle(String author, String title) {

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        } else if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is null");
        }
        Book key = new Book(author, title);
        int index = Collections.binarySearch(books, key);
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }
}
