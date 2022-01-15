package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    public Map<String, Integer> Paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return Paper;
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (Paper.containsKey(className)) {
            Paper.put(className, Paper.get(className) + kilogramms);
        } else {
            Paper.put(className, kilogramms);
        }
    }

    public String getWinnerClass() {

        String result = "";
        int max = 0;

        for (Integer i : Paper.values()) {
            if (max < i) {
                max = i;
            }
        }

        for (Map.Entry<String,Integer> entries : Paper.entrySet()) {
            if (entries.getValue().equals(max)) {

                result = entries.getKey();
            }
        }
        if (result == null) {
            throw new IllegalArgumentException();
        }
        return result;
    }


    public int getTotalWeight() {
        int sum = 0;

        for (Integer i : Paper.values()) {
            sum += i;
        }
        return sum;
    }
}
