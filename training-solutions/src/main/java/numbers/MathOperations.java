package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println("Please solve the following calculation: 12/2*4-(3+1)");
        Scanner scanner=new Scanner(System.in);

        double result= scanner.nextDouble();
        double calculation=12/2*4-(3+1);

        System.out.println(Math.abs(calculation-result)<=0.0001);
        System.out.println(result==calculation);
    }
}
