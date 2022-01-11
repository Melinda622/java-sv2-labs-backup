package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int length = min(day.length, anotherDay.length);
        double[] day1 = Arrays.copyOf(day, length);
        double[] day2 = Arrays.copyOf(anotherDay, length);
        return Arrays.equals(day1, day2);
    }

    private int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public boolean wonLottery(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        ArraysMain array = new ArraysMain();

        System.out.println(array.numberOfDaysAsString());

        System.out.println(array.multiplicationTableAsString(3));

        double[] monday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9, 24.9};
        double[] tuesday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9, 24.9};

        System.out.println(array.sameTempValues(monday, tuesday));

        double[] wednesday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9, 24.9};
        double[] thursday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9, 24.9, 32, 6};

        double[] friday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9};
        double[] saturday = {16.5, 27.5, 14.0, 18.0, 25.0, 30.5, 10.6, 9.0, 8.8, 5.8, 1.2, 14.2, 13.2, 12.5, 19.0, 18.9, 3.0, 22.5, 24.6, 16.6, 5.8, 7.8, 3.9, 13.9, 28.9, 24.9, 32, 6};

        System.out.println(array.sameTempValuesDaylight(wednesday, thursday));
        System.out.println(array.sameTempValuesDaylight(friday, saturday));

        int[] lottery = {4, 21, 32, 45, 84};
        int[] lottery2 = {84, 21, 32, 4, 45};

        System.out.println(array.wonLottery(lottery, lottery2));
        System.out.println(Arrays.toString(lottery2));
    }
}


