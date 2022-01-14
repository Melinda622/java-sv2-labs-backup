package collectionsmap;

import java.util.*;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){

        List<Integer> numbers=new ArrayList<>();

        for (Map.Entry<Integer, String> actual:applicants.entrySet()) {
            numbers.add(actual.getKey());
        }

        int minDifference = 1000;
        int next=0;

        for (int i = 0; i <numbers.size() ; i++) {
            if(minDifference>numbers.get(i)-lastNumber&&numbers.get(i)>lastNumber){
                minDifference=numbers.get(i)-lastNumber;
                next=numbers.get(i);
            }
        }
        return applicants.get(next);
    }
}
