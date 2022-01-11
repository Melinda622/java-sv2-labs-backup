package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to invest?");
        int fund = scanner.nextInt();

        System.out.println("Interest rate");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        double yield = investment.getYield(50);
        System.out.println("Yield after 50 days: " + yield);

        System.out.println("Payout after 50 days: " + investment.close(50));
        System.out.println("Payout after 80 days: " + investment.close(80));
    }
}
