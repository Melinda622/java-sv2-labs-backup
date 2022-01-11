package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> output;
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        try {
            output = Files.readAllLines(path);

            for (String s : output) {
                sb.setLength(0);
                String[] arr = s.split(":");
                int amountPerCity = amount / Integer.parseInt(arr[1].trim());
                sb.append(arr[0]).append(": ").append(amountPerCity);
                result.add(sb.toString());
            }

        } catch (NumberFormatException | IOException | ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }
}
