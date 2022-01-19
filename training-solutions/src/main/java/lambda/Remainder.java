package lambda;

import java.util.List;

public class Remainder {

    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        numbers.replaceAll((Integer i) -> i % divisor);
        return numbers;
    }

    public static void main(String[] args) {
        Remainder remainder = new Remainder();
    }
}
