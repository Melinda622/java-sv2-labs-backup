package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the name of the product?");
        String name=scanner.nextLine();

        System.out.println("How much is the price of the product?");
        int price=scanner.nextInt();

        Product product1=new Product(name,price);
        System.out.println("Product: "+product1.getName()+" "+"Price: "+product1.getPrice()+" EUR");


        System.out.println("How much should the price increase be?");
        product1.increasePrice(scanner.nextInt());
        System.out.println("Updated price: "+product1.getPrice()+" EUR");

        System.out.println("How much should the price decrease be?");
        product1.decreasePrice(scanner.nextInt());
        System.out.println("Updated price: "+product1.getPrice()+" EUR");
    }
}
