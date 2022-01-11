package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        int result = 0;
        if (numbers.length > 1) {
            int firstItem=numbers[0];
            numbers = Arrays.copyOfRange(numbers, 1, numbers.length);
            int sum = getSum(numbers);
            result = firstItem + sum;
        } else if (numbers.length == 1) {
            result = numbers[0];
        }
        return result;
    }
}