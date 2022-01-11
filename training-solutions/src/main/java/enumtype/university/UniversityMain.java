package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        University elte=University.ELTE;
        System.out.println(elte.getName());

        University bme=University.BME;
        System.out.println(bme.getName());
    }
}
