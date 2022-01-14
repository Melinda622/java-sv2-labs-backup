package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private String name;
    private int money;
    private List<String> classList;
    private Map<String, Integer> inpayments =new HashMap<>();

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<String> getClassList() {
        return classList;
    }

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }

    public void read(Path path){
        try {
            classList =Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public Map<String,Integer> loadInpayments(Path path){
        read(path);

        for (int i = 0; i < classList.size() ; i++) {
            String[] a= classList.get(i).split(":");
            name=a[0];
            money=Integer.parseInt(a[1].trim());
            inpayments.put(name,money);
        }
        return inpayments;
    }
}
