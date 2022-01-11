package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void printStreetTests2() throws IOException {
        Path path = temporaryFolder.toPath().resolve("books.txt");
        List<String> bookList = new ArrayList<>();
        new Books().printBooks(path, bookList);

        List<String> result = Files.readAllLines(path);
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok", "Molnár Ferenc: Pál utcai fiúk", "Fekete István: Tüskevár", "Jókai Mór: Kőszívű ember fiai"), result);
    }
}