package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Dog> dogs=new ArrayList<>();

    public static long code=1;

    public void addDog(Dog dog){
        dog.setCodeNumber(code);
        dogs.add(dog);
        code++;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

}
