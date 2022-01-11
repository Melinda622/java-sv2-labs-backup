package arrayofarrays;

public class Triangular {

    public void triangularMatrix(int size) {
        int [][]d = new int[size][size];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j<=i; j++) {
                d[i][j] = i;
                System.out.print(d[i][j] + " ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangular triangle=new Triangular();
        triangle.triangularMatrix(2);
        triangle.triangularMatrix(6);
    }
}
