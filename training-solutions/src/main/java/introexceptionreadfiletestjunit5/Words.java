package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;;
import java.util.List;

public class Words {

    private List<String> readWords(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String getFirstWordWithA(Path path) {
        String result = "";
        for (String s : readWords(path)) {
            if (s.startsWith("a") || s.startsWith("A")) {
                result = s;
                return result;
            } else {
                result = "A";
            }
        }
        return result;
    }
}
