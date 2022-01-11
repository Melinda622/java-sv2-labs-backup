package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSeven {

    public void writeNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int number= scanner.nextInt();
        while(number%10!=7||number%7==0) {
            if (number % 7 == 0) {
                System.out.println('x');
            } else {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void main(String[] args) {
        ForbiddenSeven seven=new ForbiddenSeven();
        seven.writeNumbers();
    }
}
