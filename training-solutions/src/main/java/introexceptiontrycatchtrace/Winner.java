package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    List<String> winners = new ArrayList<>(Arrays.asList("Percy Powell", "Ricky Pearson", "Donald Crawford", "Mandy Diaz", null));

    public String getWinner() {
        Random random = new Random();
        String winner = winners.get(random.nextInt(1, 5));
        return winner.toUpperCase();
    }
}
