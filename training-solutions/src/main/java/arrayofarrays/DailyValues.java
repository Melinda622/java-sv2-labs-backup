package arrayofarrays;

public class DailyValues {
    public void getValues() {
        int[][] d = new int[12][];
        int[] e = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < d.length; i++) {
            d[i] = new int[e[i]];
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues daily = new DailyValues();
        daily.getValues();
    }
}
