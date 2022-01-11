package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> population, int limit) {
        boolean contains = false;
        for (Integer i : population) {
            if (i < limit) {
                contains = true;
            }
        }
        return contains;
    }
}
