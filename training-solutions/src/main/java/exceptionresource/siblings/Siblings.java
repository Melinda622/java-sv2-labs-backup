package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path){
        List<String> fullNames=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                sb.setLength(0);
                String line = scanner.nextLine();
                sb.append(lastName).append(" ").append(line);
                fullNames.add(sb.toString());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return fullNames;
    }
}
