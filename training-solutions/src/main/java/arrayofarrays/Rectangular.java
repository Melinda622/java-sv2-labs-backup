package arrayofarrays;

public class Rectangular {

    public void rectangularMatrix(int size) {
        int[][] d = new int[size][size];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = i;
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangular rectangle = new Rectangular();

        rectangle.rectangularMatrix(4);
        rectangle.rectangularMatrix(6);
    }
}
