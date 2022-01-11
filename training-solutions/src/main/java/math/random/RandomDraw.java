package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> winners = new ArrayList<>(Arrays.asList("Shannon Harmon", "Victor Powell", "Jerry Hayes", "Adrian Farmer", "Lela Graves", "Edmund Stewart", "Ernesto Allison", "Johanna Pratt", "Levi Sutton", "Nicole Tate"));

        System.out.println(new Random().nextInt(1, 5));
        System.out.println(new Random().nextInt(6, 10));

        System.out.println(winners.get(new Random().nextInt(1, 5)));
        System.out.println(winners.get(new Random().nextInt(6, 10)));
    }
}
