package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber==null){
            throw new IllegalArgumentException("Account number should not be null!");
        }else if(balance<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract = 100000;
    }

    public double subtract(double amount) {
        if(amount<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }else if(balance<amount){
            throw new LowBalanceBankOperationException("Low balance!");
        }
        return balance -= amount;
    }

    public double deposit(double amount) {
        if(amount<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        return balance += amount;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }
}
