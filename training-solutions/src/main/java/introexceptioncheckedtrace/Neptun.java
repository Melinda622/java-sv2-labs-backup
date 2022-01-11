package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Neptun {

    public List<String> readName() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/neptun.csv"));
    }

    public static void main(String[] args) {

        Neptun neptun = new Neptun();

        List<String> neptunCodes = new ArrayList<>();

        try {
            List<String> neptunData = neptun.readName();
            for (int i = 0; i < neptunData.size(); i++) {
                Scanner scanner = new Scanner(neptunData.get(i)).useDelimiter(",");

                scanner.next();

                String code = scanner.next();
                neptunCodes.add(code);

            }
            System.out.println(neptunCodes);

        } catch (IOException ioe) {
            System.out.println("Cannot read file");
            ioe.printStackTrace();
        }
    }
}
