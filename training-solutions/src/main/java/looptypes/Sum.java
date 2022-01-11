package looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.print(numbers[i] + numbers[i - 1] + " ");
        }
    }

    public static void main(String[] args) {

        int[] num = {2, 6, 3, 5, 7, 9};

        Sum sum = new Sum();
        sum.printSums(num);
    }
}
