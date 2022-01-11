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

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void printStreetTests2() throws IOException {
        Path path = temporaryFolder.toPath().resolve("electricity.txt");
        System.out.println(path);
        List<String> streetList = Arrays.asList("2021-11-28", "Csap utca", "Aladár utca", "Harkály utca");
        new Electricity().printStreets(path, streetList);

        List<String> result = Files.readAllLines(path);
        assertEquals(Arrays.asList("2021-11-28", "Csap utca", "Aladár utca", "Harkály utca"), result);
    }
}