package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    List<String> readBillItemsFromFile(Path path){
        List<String> output=new ArrayList<>();
        try {
           output= Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }return output;
    }
}
