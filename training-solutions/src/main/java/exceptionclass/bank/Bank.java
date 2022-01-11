package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {

        int count = 0;

        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                count++;
                a.subtract(amount);
            }
        }

        if (count == 0) {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }

    public void deposit(String accountNumber, double amount) {

        int count = 0;

        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                count++;
                a.deposit(amount);
            }
        }
        if (count == 0) {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }
}
