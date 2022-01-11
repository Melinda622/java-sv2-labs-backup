package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @TempDir
    File temporaryFolder;

    @Test
    void writeNames() throws IOException {
        Path path = temporaryFolder.toPath().resolve("names.txt");
        System.out.println(path);
        List<Employee> employees =
                Arrays.asList(new Employee("John"), new Employee("Jack"), new Employee("Jane"));
        new Names().writeNames(employees, path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("John", "Jack", "Jane"), lines);
    }
}