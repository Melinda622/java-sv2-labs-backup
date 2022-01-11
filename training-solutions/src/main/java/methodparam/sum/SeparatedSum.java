package methodparam.sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {

    public Sums sum(String floatingNumbers) {
        Sums sum = new Sums(0, 0);
        floatingNumbers = floatingNumbers.replace(',', '.');
        String[] separatedNumbers = floatingNumbers.split(";");
        double sumPositive = 0;
        double sumNegative = 0;
        for (String s : separatedNumbers) {
            if (Double.parseDouble(s) > 0) {
                sum.setSumPositive(sumPositive += Double.parseDouble(s));
            } else {
                sum.setSumNegative(sumNegative += Double.parseDouble(s));
            }
        }
        return sum;
    }

    public String readFromFile() {
        Path path = Paths.get("src/main/resources/floatingnumbers.txt");
        List<String> floatingNumbers = new ArrayList<>();
        try {
            floatingNumbers = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return floatingNumbers.get(0);
    }
}
