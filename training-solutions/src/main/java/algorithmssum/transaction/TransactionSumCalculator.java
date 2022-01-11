package algorithmssum.transaction;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumOfCredits = 0;
        for (Transaction t : transactions) {
            if (t.isCredit()) {
                sumOfCredits += t.getAmount();
            }
        }
        return sumOfCredits;
    }
}
