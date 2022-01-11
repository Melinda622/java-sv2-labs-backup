package controliteration.division;

import java.util.Scanner;

public class Division {

    public void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (i % divisor == 0) {
                System.out.println(i);
            }
        }
    }

    public void divide2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        int result = 1;
        while (result < number) {
            if (result % divisor == 0) {
                System.out.println(result);
            }
            result++;
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.divide();
        division.divide2();
    }
}
