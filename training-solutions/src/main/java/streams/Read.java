package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Read {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream().filter(book -> book.getPages() < maxNumberOfPages).map(book -> book.getTitle()).collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        List<String> titles = books.stream().filter(book -> book.getAuthor().equals(author)).
                map(book -> book.getTitle()).sorted().
                collect(Collectors.toList());
        return titles;
    }

    public List<String> listAuthors() {
        List<String> authors = books.stream().map(book -> book.getAuthor()).distinct().
                collect(Collectors.toList());
        return authors;
    }
}
