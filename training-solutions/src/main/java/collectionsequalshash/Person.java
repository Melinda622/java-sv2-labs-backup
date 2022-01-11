package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssNumber) {
        this.name = name;
        this.age = age;
        this.ssn = ssNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }else if(obj.getClass()!=Person.class){
            return false;
        }else if(this.ssn ==null){
            return false;
        }
        return ((Person) obj).ssn.equals(this.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }



    public static void main(String[] args) {
        Person person = new Person("John Doe", 34, "345678567");
        Person person2 = new Person("Jack Doe", 44, "345678567");

        System.out.println(person.equals(person2));

        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }
}
