package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("In order to register, please enter your name:");
        String name=scanner.nextLine();

        System.out.println("Please enter your email address:");
        String email=scanner.nextLine();

        System.out.println("You registered with the following name and email address:");
        System.out.println(name);
        System.out.println(email);

    }
}
