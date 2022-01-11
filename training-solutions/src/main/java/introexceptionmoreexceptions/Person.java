package introexceptionmoreexceptions;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "name:" + name + '\'' +
                ", age:" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());

        //A person.getName() visszatéréséi értéke null.
    }
}
