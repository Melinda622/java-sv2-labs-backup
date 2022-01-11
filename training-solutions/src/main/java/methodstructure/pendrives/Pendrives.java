package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive bestPendrive = pendrives.get(0);
        int best = pendrives.get(0).getPrice() / pendrives.get(0).getCapacity();
        for (Pendrive p : pendrives) {
            int pricePerCapacity = p.getPrice() / p.getCapacity();
            if (pricePerCapacity < best) {
                best = pricePerCapacity;
                bestPendrive = p;
            }
        }
        return bestPendrive;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapestPendrive = pendrives.get(0);
        int cheapest = pendrives.get(0).getPrice();
        for (Pendrive p : pendrives) {
            if (p.getPrice() < cheapest) {
                cheapest = p.getPrice();
                cheapestPendrive = p;
            }
        }
        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }
}
