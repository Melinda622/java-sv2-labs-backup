package interfaces.animal;

import java.util.List;

public class Zoo {

    List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int sum = 0;
        for (Animal a : animals)
            sum += a.getNumberOfLegs(); {
        }
        return sum;
    }
}
