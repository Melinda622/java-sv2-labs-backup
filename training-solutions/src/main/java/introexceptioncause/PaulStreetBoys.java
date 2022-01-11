package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readNamesFromBook() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printNames() {

        for (String n : readNamesFromBook()) {
            if (n.startsWith("Nemecsek")) {
                System.out.println(n.toLowerCase());
            } else {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {

        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();

        paulStreetBoys.printNames();
    }
}
