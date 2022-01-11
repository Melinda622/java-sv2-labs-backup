package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem earth = SolarSystem.EARTH;
        System.out.println(earth.getMoons());

        SolarSystem jupiter = SolarSystem.JUPITER;
        System.out.println(jupiter.getMoons());

        SolarSystem saturn = SolarSystem.SATURN;
        System.out.println(saturn.getMoons());
    }
}
