package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler array = new ArrayHandler();
        int[] numbers = new int[]{1, 2, 3};
        array.addIndexToNumber(numbers);
        for (int b : numbers) {
            System.out.println(b + " ");
        }
        for (int b : numbers) {
            System.out.print(b + "," + " ");
        }
        System.out.println("");

        String[] fruits = new String[]{"apple", "pear", "peach"};
        array.concatenateIndexToWord(fruits);
        for (String f : fruits) {
            System.out.println(f);
        }

        for (String f : fruits) {
            System.out.print(f + "," + " ");
        }
    }
}
