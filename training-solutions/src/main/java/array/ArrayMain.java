package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfTheWeek[1]);
        System.out.println(daysOfTheWeek.length);

        int[] power = new int[5];
        power[0] = 1;

        for (int i = 1; i < power.length; i++) {
            power[i] = power[i - 1] * 2;
        }

        for (int p : power) {
            System.out.print(p + " ");
        }
        System.out.println("");

        boolean[] array = new boolean[6];
        array[0] = false;

        for (int i = 1; i < array.length; i++) {
            array[i] = !(array[i - 1]);
        }
        for (boolean x : array) {
            System.out.print(x + " ");
        }
    }
}
