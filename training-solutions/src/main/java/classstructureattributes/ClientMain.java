package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Client client=new Client();

        System.out.println("What is your name?");
        client.name=scanner.nextLine();
        System.out.println("Name:"+client.name);

        System.out.println("What year were you born in?");
        client.yearOfBirth=scanner.nextInt();
        System.out.println("Year of birth:"+client.yearOfBirth);
        scanner.nextLine();

        System.out.println("What is your address?");
        client.address=scanner.nextLine();
        System.out.println("Address:"+client.address);


    }

}
