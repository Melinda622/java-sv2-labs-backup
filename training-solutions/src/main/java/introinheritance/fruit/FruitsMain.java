package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {

        //Fruit
        System.out.println("Fruit");
        Fruit fruit=new Fruit();
        fruit.setName("pear");
        fruit.setWeight(1);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        //Grape
        System.out.println("Grape");
        Grape grape=new Grape();
        grape.setType("Othello");

        System.out.println(grape.getType());
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());

        //Apple
        System.out.println("Apple");
        Apple apple=new Apple();
        apple.setPieces(8);

        System.out.println(apple.getPieces());
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());

        //Goldendelicious
        System.out.println("Goldendelicious");
        GoldenDelicious goldenDelicious=new GoldenDelicious();
        System.out.println(goldenDelicious.getColour());
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());

        //Starking
        System.out.println("Starking");
        Starking starking=new Starking();
        System.out.println(starking.getColour());
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());

    }
}
