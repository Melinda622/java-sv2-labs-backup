package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River {

    List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {

        River river=new Danube("Szajna",777, Arrays.asList("Paris"));
        Water water=new Danube("Temze", 346,Arrays.asList("London"));
        Danube danube=new Danube("Duna", 2857,Arrays.asList("Budapest", "Bécs"));

        System.out.println(river.getLength());
        System.out.println(river.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getCapitals());
        System.out.println(danube.getName());
    }
}
