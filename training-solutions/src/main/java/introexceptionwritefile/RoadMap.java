package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Budapest", "Tatabánya", "Győr", "Mosonmagyaróvár", "Hegyeshalom", "Bécs", "St. Pötlen", "Linz", "Salzburg", "München");
        try {
            Files.write(Paths.get("src/main/java/introexceptionwritefile/roadmap.txt"), cities);
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }
}


