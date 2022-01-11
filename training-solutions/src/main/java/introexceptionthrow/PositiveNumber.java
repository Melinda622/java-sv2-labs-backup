package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive integer number!");
        String numberString= scanner.nextLine();

        char[] chars = numberString.toCharArray();
        for (char c:chars) {
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("The characters you entered are not a number!");
            }
        }
        if(Integer.parseInt(numberString)<1){
            throw new IllegalArgumentException("The number you entered is not positive!");
        }
        System.out.println("The number you entered: "+Integer.parseInt(numberString));
    }
}
