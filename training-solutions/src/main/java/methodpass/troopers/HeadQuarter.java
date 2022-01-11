package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (findTrooperByName(name).getName().equals(name)) {
            findTrooperByName(name).changePosition(target);
        }
    }

    public Trooper findTrooperByName(String name) {
        Trooper trooper = null;
        for (Trooper t : troopers) {
            if (t.getName().equals(name)) {
                trooper = t;
            }
        }
        return trooper;
    }

    public void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public Trooper findClosestTrooper(Position target) {
        Trooper closest = troopers.get(0);

        for (Trooper t : troopers) {
            if (t.getPosition().distanceFrom(target) < closest.getPosition().distanceFrom(target)) {
                closest = t;
            }
        }
        return closest;
    }

    public void moveClosestTrooper(Position target) {
        findClosestTrooper(target).changePosition(target);
    }
}

