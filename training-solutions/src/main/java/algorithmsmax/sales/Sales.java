package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        int biggest = sales.get(0).getAmount();
        Salesperson result = null;

        for (Salesperson p : sales) {
            if (p.getAmount() > biggest) {
                biggest = p.getAmount();
                result = p;
            }

        }
        return result;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        int biggest = sales.get(0).getAmount() - sales.get(0).getTarget();
        Salesperson best = null;

        for (Salesperson s : sales) {
            int margin = s.getAmount() - s.getTarget();
            if (margin > 0 && margin > biggest) {
                biggest = margin;
                best = s;
            }

        }
        return best;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        int biggest = -sales.get(0).getTarget() - sales.get(0).getAmount();
        Salesperson worst = null;

        for (Salesperson s : sales) {
            int margin = s.getTarget() - s.getAmount();
            if (margin > 0 && margin > biggest) {
                biggest = margin;
                worst = s;
            }

        }
        return worst;
    }
}
