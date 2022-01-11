package staticattrmeth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions=0;
    private static long sumOfTransactions=0;
    private static long currentMinValue;
    private static long currentMaxValue;

    public long transactionValue;

    public BankTransaction(long transactionValue) {
        this.transactionValue = transactionValue;
    }

    public static void initTheDay(long minValue, long maxValue) {
        currentMinValue = minValue;
        currentMaxValue = maxValue;
    }

    private static boolean isValid(BankTransaction... bankTransactions) {
        for (BankTransaction l : bankTransactions) {
            if (l.transactionValue < currentMinValue || l.transactionValue > currentMaxValue) {
                throw new IllegalArgumentException("The value of the transaction is not within the allowed limits!");
            } else {
                return true;
            }
        }
        return false;
    }

    public static long getSumOfTransactions(BankTransaction... bankTransactions) {
        long sum = 0;
        for (BankTransaction l : bankTransactions) {
            try {

                if (l.transactionValue > currentMinValue && l.transactionValue < currentMaxValue) {
                    sum += l.transactionValue;
                } else {
                    throw new IllegalArgumentException(l.getTransactionValue()+": This amount is not within the allowed limits!");
                }

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        System.out.println("The sum of the allowed daily transactions:");
        return sum;
    }

    public static long getAverageOfTransaction(BankTransaction... bankTransactions) {
        long average=0;
        try {
             average = getSumOfTransactions(bankTransactions) / bankTransactions.length;
        }catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return average;
    }

    public long getTransactionValue() {
        return transactionValue;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

}
