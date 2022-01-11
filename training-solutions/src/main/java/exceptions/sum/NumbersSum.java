package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("The numbers array cannot be null");
        } else {
            for (int i : numbers) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("The numbers array cannot be null");
        } else {
            for (String n : numbers) {
                try {
                    sum += Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("One of the array items is not a number");
                }
            }
        }
        return sum;
    }
}
