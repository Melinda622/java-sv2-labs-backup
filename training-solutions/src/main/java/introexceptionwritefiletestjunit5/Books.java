package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public List<String> readBooks() {

        try {
            return Files.readAllLines(Path.of("src/main/java/introexceptionwritefiletestjunit5/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<String> addBooks(List<String> books) {

        books = readBooks();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            String[] a = books.get(i).split(";");
            result.add(a[2] + ": " + a[1]);

        }
        return result;
    }

    public void printBooks(Path path, List<String> books) {

        List<String> result = addBooks(books);
        try {
            Files.write(path, result);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
