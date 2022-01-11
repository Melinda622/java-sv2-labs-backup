package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Address address1 = new Address("Hungary", "Budapest", "Csap utca 5", "1016");
        Person person1 = new Person("John Doe", "494493", address1);

        System.out.println(person1.getAddress().toString());

        System.out.println(person1.getAddress().getCity());
        System.out.println(person1.getAddress());

        Address address2 = new Address("Hungary", "Győr", "Fő utca 2", "9024");
        person1.moveTo(address2);
        System.out.println(person1.getAddress());

        address2.correctData("Hungary", "Budapest", "Budaörsi út 10", "1114");

        person1.correctData("Jane Sloane", "1122434", address2);

        System.out.println(person1.personToString());

        System.out.println(person1.getAddress());
    }
}
