package conversions;

public class TooBigNumber {
    public double getRightResult(int number) {
        return (long) 2_147_483_647 + number;
    }

    public static void main(String[] args) {
        TooBigNumber big = new TooBigNumber();
        System.out.println(big.getRightResult(10));
    }
}
