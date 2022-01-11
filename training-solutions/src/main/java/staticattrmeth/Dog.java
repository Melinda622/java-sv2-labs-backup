package staticattrmeth;

public class Dog {

    private String name;
    private int age;
    private Species breed;
    private long codeNumber;

    public Dog(String name, int age, Species breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Species getBreed() {
        return breed;
    }

    public void setBreed(Species breed) {
        this.breed = breed;
    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
