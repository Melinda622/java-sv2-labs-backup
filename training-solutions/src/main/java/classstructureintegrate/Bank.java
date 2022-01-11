package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your bank account number?");
        String accountNumber=scanner.nextLine();

        System.out.println("What is your name?");
        String owner=scanner.nextLine();

        System.out.println("What is your initial deposit?");
        int balance=scanner.nextInt();

        BankAccount account=new BankAccount(accountNumber,owner,balance);

        System.out.println("Opening bank acount information:"+account.getInfo()+" Ft");

        System.out.println("How much money would you like to deposit?");
        account.deposit(scanner.nextInt());
        System.out.println("New balance: "+account.getBalance()+" Ft");

        System.out.println("How much money would you like to withdraw?");
        account.withdraw(scanner.nextInt());
        System.out.println("New balance: "+account.getBalance()+" Ft");

        System.out.println("Updated bank account information: "+account.getInfo());
    }
}
