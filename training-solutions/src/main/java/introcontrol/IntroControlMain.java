package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl intro = new IntroControl();

        System.out.println(intro.subtractTenIfGreaterThanTen(8));
        System.out.println(intro.subtractTenIfGreaterThanTen(20));

        System.out.println(intro.describeNumber(0));
        System.out.println(intro.describeNumber(3));


        System.out.println(intro.greetingToJoe("Joe"));
        System.out.println(intro.greetingToJoe("Jack"));

        System.out.println(intro.calculateBonus(1000));
        System.out.println(intro.calculateBonus(1000000));
        System.out.println(intro.calculateBonus(2000000));

        System.out.println(intro.calculateConsumption(30, 800));
        System.out.println(intro.calculateConsumption(10100, 9000));

        intro.printNumbers(3);
        intro.printNumbers(1);

        intro.printNumbersBetween(1, 3);
        intro.printNumbersBetween(4, 7);

        intro.printNumbersBetweenAnyDirection(1, 3);
        intro.printNumbersBetweenAnyDirection(3, 1);

        intro.printOddNumbers(11);
    }
}
