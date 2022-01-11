package interfacedependencyinversion.vaccine;

public class Person {

    private String Name;
    private int age;
    private ChronicDisease chronic;
    private Pregnancy pregnant;

    public Person(String name, int age, ChronicDisease chronic, Pregnancy pregnant) {
        Name = name;
        this.age = age;
        this.chronic = chronic;
        this.pregnant = pregnant;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public ChronicDisease getChronic() {
        return chronic;
    }

    public Pregnancy getPregnant() {
        return pregnant;
    }
}
