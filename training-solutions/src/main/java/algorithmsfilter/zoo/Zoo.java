package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals=new ArrayList<>();

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> result=new ArrayList<>();
        for (Animal a:animals ){
            if(a.getNumberOfLegs()==numberOfLegs){
                result.add(a);
            }
        }return result;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
