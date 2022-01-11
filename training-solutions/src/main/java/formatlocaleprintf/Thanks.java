package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {

        List<String> text=new ArrayList<>(Arrays.asList("John","Jack","Jane"));


        for (String i:text){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n",i);
        }
    }
}
