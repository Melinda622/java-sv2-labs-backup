package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish nemo = new Fish("clown", "orange");
        Fish guppi = new Fish("neon", "blue");

        aquarium.addFish(nemo);
        aquarium.addFish(guppi);

        aquarium.getNumberOfFish();

        //Nincs inicializálva lista.
    }
}


