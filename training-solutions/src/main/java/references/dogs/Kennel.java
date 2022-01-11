package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs=new ArrayList<>();
        Dog australianShepherd=new Dog("Buddy",5,"brown");
        Dog dachshund=new Dog("Johnny",8,"grey");
        Dog borderCollie=new Dog("Lady",2,"black");

        dogs.add(australianShepherd);
        dogs.add(dachshund);
        dogs.add(borderCollie);
        System.out.println(dogs);

        Dog labrador=dogs.get(1);
        labrador.setColour("beige");
        System.out.println(dogs);

        Dog germanshepherd=new Dog("Rex",4,"beige");
        System.out.println(germanshepherd);
        germanshepherd=dogs.get(1);
        dogs.add(germanshepherd);
        System.out.println(germanshepherd);

        Dog eskimo=labrador;
        eskimo.setColour("white");
        System.out.println(dogs);


        List<Dog> dogs2=dogs;
        Dog poodle=labrador;
        poodle.setColour("black");

        System.out.println(dogs2);
        dachshund.setColour("grey");
        System.out.println(dogs2);

        dachshund=null;
        System.out.println(dogs2);

        Dog frenchBulldog=dogs.get(1);
        frenchBulldog=null;
        System.out.println(dogs2);

        Dog mops=dogs.get(1);
        mops.setColour("beige");
        System.out.println(dogs2);
    }
}
