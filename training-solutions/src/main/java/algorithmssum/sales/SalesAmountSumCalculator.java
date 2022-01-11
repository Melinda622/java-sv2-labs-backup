package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salespersons){

            int salesAmountSum=0;
            for (Salesperson s:salespersons){
                salesAmountSum+=s.getAmount();
            }
            return salesAmountSum;
    }
}
