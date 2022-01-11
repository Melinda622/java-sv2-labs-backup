package numbers;

import java.util.Scanner;

public class Percent {

   public double getValue(int number, int percent){
        return number*percent/100;
   }

    public double getBase(int number, int percent){
        return number*1.0/(percent*1.0/100);
    }

   public double getPercent(int number, int anotherNumber){
       return anotherNumber*1.0/number*100;
   }

    public static void main(String[] args) {
        Percent percent=new Percent();
        Scanner scanner=new Scanner(System.in);

        int number= scanner.nextInt();
        int percentage=scanner.nextInt();

        System.out.println(percent.getValue(number,percentage));

        int number2= scanner.nextInt();
        int percentage2=scanner.nextInt();

        System.out.println(percent.getBase(number2,percentage2));

        int number3= scanner.nextInt();
        int anotherNumber=scanner.nextInt();

        System.out.println(percent.getPercent(number3,anotherNumber));
    }
}
