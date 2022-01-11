package arrayofarrays;

import java.util.Arrays;

public class Test {
    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void createMatrix(int size) {
        int [][]d = new int[size][size];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = j;
                System.out.print(d[i][j] + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[][] a = {{1}, {2, 2}};
        /*System.out.println(a[1][1]);
        System.out.println(a[1].length);
        System.out.println(a.length);

        System.out.println(Arrays.toString(a[1]));*/
        int[][] b = new int[2][2];

       /* for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i;
            }
        }*/
       /* for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length - 1; j++) {
                System.out.println(b[i][j] + ", " + b[i][j + 1]);
            }
        }
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));*/

        int[][] c = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        /*for (int i=0;i<c.length;i++){
            for(int j=0;j<1;j++) {
                System.out.println(c[i][j]+", "+c[i][j+1]+", "+c[i][j+1+1]);
            }
        }*/

       /* for (int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]+", ");
            }System.out.println();
        }*/
        int[][]e=new int[2][2];
        //test.printArrayOfArrays(c);
        test.createMatrix(3);

    }
}
