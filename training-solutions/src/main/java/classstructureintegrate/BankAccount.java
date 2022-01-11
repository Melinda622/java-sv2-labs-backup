package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int deposit(int amount){
        return balance=amount+balance;
    }

    public int withdraw(int amount){
        return balance=balance-amount;
    }

    public String getInfo(){
        return owner+" "+"("+accountNumber+")"+" "+balance+" Ft";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
