package statements;

import java.util.Scanner;

public class DivByThree {

    public String divisibleByThree(int number) {
        return (number % 3 == 0) ? "yes" : "no";
    }

    public static void main(String[] args) {

        DivByThree div=new DivByThree();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter an integer!");
        int number= scanner.nextInt();
        System.out.println("Is your integer divisible by three?"+" "+div.divisibleByThree(number));
    }
}
