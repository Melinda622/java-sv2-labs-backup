package controliteration.fibonacci;

import java.util.Arrays;

public class Fibonacci {

    public void sequence(int size) {
        int[] numbers = new int[size];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < size; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.sequence(10);
    }
}
