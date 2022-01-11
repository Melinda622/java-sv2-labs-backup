package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int maxLimit) {
        int countCredits = 0;
        for (Transaction t : transactions) {
            if (t.isCredit()&&t.getAmount()<maxLimit) {
                countCredits++;
            }
        }
        return countCredits;
    }
}
