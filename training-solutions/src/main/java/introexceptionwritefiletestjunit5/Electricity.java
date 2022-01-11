package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public List<String> createStreetList() {

        List<String> streetList = new ArrayList<>();
        streetList.add(LocalDate.now().toString());
        streetList.add("Csap utca");
        streetList.add("Aladár utca");
        streetList.add("Harkály utca");
        return streetList;
    }

    public void printStreets(Path path, List<String> streetList) {
        streetList = createStreetList();
        try {
            Files.write(path, streetList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }
}
