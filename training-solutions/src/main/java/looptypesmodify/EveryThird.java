package looptypesmodify;

import java.util.Arrays;

public class EveryThird {

    public void changeToZero(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i = i - 3) {
            numbers[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] num = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        EveryThird third = new EveryThird();
        third.changeToZero(num);
        System.out.println(Arrays.toString(num));
    }
}
