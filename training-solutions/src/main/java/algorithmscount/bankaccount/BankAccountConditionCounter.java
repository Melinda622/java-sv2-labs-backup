package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int minLimit) {
        int count = 0;
        for (BankAccount b : bankAccounts) {
            if (b.getBalance() >minLimit) {
                count++;
            }
        }
        return count;
    }
}
