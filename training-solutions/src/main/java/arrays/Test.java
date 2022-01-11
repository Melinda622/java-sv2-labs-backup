package arrays;



public class Test {

    public void multiplicationTableAsString(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length-1; j++) {
                int product = a[i][j] * a[i][j + 1];
                System.out.print(product + " ");
            }
        }
    }
    public static void main(String[] args) {
        Test test=new Test();
        int[][] numbers = {{2, 1}, {2, 2}, {2, 3}, {2, 4}};
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                int product = numbers[i][j] * numbers[i][j + 1];
                System.out.print(product + " ");
            }
        }*/
        test.multiplicationTableAsString(numbers);
    }
}


