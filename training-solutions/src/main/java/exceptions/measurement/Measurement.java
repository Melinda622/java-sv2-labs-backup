package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Error during the reading of the file");
        }
        return result;
    }

    public List<String> validate(List<String> input) {
        List<String> errors = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            String[] arr = input.get(i).split(",");

            if (!serialNumberIsValid(arr)) {
                errors.add((i + 1) + ".line: The serial number is not a number!");
            } else if (!measurementIsValid(arr)) {
                errors.add((i + 1) + ".line: The measurement is not a number!");
            } else if (!nameIsValid(arr)) {
                errors.add((i + 1) + ".line: Name is one word!");
            } else if (!arrayLengthisValid(arr)) {
                errors.add((i + 1) + ".line: There should be exactly 3 pieces of data in one line!");
            }

        }

        return errors;
    }

    public boolean serialNumberIsValid(String[] arr) {
        try {
            Integer measurement = Integer.parseInt(arr[0]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean measurementIsValid(String[] arr) {

        try {
            Double measurement = Double.parseDouble(arr[1]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean nameIsValid(String[] arr) {

        String name = null;
        try {
            name = arr[2];
            if (name.indexOf(" ") == -1) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            arrayLengthisValid(arr);
        }
        return true;
    }

    public boolean arrayLengthisValid(String[] arr) {

        if (arr.length == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void extract(List<String> input) {
        String[] arr = input.get(0).split(",");
        System.out.println(arr[0]);
    }


    public static void main(String[] args) {
        Measurement measurement = new Measurement();
        Path path = Paths.get("src/test/resources/measurementdata.csv");
        List<String> test = Arrays.asList("8", "12", "John Doe");
        String[] test2 = {"a", "12", "John Doe"};
        System.out.println(measurement.serialNumberIsValid(test2));
        System.out.println(measurement.measurementIsValid(test2));

        List<String> tobeextracted = measurement.readFromFile(path);
        //System.out.println(tobeextracted);
        //measurement.extract(tobeextracted);
        System.out.println(measurement.validate(tobeextracted));

    }
}
