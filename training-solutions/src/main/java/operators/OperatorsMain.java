package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operator = new Operators();
        System.out.println(Integer.toBinaryString(22));

        System.out.println(operator.isEven(22));
        System.out.println(operator.isEven(21));

        operator.getResultOfDivision(10, 5);
        operator.getResultOfDivision(24, 7);

        String s = null;
        System.out.println(operator.isNull(s));
        System.out.println(operator.isNull("hello"));

        System.out.println(operator.isEmpty(""));
        System.out.println(operator.isEmpty(null));
        System.out.println(operator.isEmpty("hello"));
    }
}
