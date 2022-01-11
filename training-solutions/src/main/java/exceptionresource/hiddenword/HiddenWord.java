package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path){

        StringBuilder sb=new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                int count=0;
                String line = scanner.nextLine();
                for (int i = 0; i <line.length() ; i++) {
                    if (Character.isAlphabetic(line.charAt(i))) {
                        sb.append(line.charAt(i));
                        count++;
                    }
                }
                if (count==0){
                    sb.append(" ");
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }
}
