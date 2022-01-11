package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter an integer");
        int number1=scanner.nextInt();

        System.out.println("Please enter another integer");
        int number2=scanner.nextInt();

        System.out.println(number1+"+"+number2);
        System.out.println(number1+number2);
    }
}
