package references.parameter;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 32);
        Person person2 = person1;
        person2.setName("Glenn Doyle");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int number1 = 24;
        int number2 = number1;
        number2 = number2 + 1;
        System.out.println(number1);
        System.out.println(number2);

        Person person3 = new Person("Jane Doe", 35);
        person1 = person3;
        System.out.println(person3.getName());
        System.out.println(person1.getName());
    }
}
